package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.FolderSecurity: ImageVector
    get() {
        if (_folderSecurity != null) {
            return _folderSecurity!!
        }
        _folderSecurity = ImageVector.Builder(
            name = "FolderSecurity",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(14.0033f, 21f)
        horizontalLineTo(12.0027f)
        curveTo(7.28739f, 21f, 4.92973f, 21f, 3.46487f, 19.5355f)
        curveTo(2f, 18.0711f, 2f, 15.714f, 2f, 11f)
        verticalLineTo(7.94427f)
        curveTo(2f, 6.1278f, 2f, 5.21956f, 2.38042f, 4.53806f)
        curveTo(2.6516f, 4.05227f, 3.05255f, 3.65142f, 3.53848f, 3.38032f)
        curveTo(4.22017f, 3f, 5.12865f, 3f, 6.94562f, 3f)
        curveTo(8.10968f, 3f, 8.69172f, 3f, 9.20122f, 3.19101f)
        curveTo(10.3645f, 3.62712f, 10.8442f, 4.68358f, 11.3691f, 5.73313f)
        lineTo(12.0027f, 7f)
        moveTo(8.00163f, 7f)
        horizontalLineTo(16.754f)
        curveTo(18.8613f, 7f, 19.9149f, 7f, 20.6718f, 7.50559f)
        curveTo(20.9995f, 7.72447f, 21.2808f, 8.00572f, 21.4997f, 8.33329f)
        curveTo(21.8937f, 8.92282f, 21.9808f, 9.69244f, 22f, 11f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(22f, 16.6204f)
        verticalLineTo(14.6493f)
        curveTo(22f, 14.3393f, 21.7723f, 14.082f, 21.477f, 14.0292f)
        curveTo(20.2869f, 13.8164f, 19.299f, 13.3431f, 18.817f, 13.0806f)
        curveTo(18.6197f, 12.9731f, 18.3803f, 12.9731f, 18.183f, 13.0806f)
        curveTo(17.701f, 13.3431f, 16.7131f, 13.8164f, 15.523f, 14.0292f)
        curveTo(15.2277f, 14.082f, 15f, 14.3393f, 15f, 14.6493f)
        verticalLineTo(16.6204f)
        curveTo(15f, 19.1918f, 17.5424f, 20.5944f, 18.2935f, 20.9526f)
        curveTo(18.426f, 21.0158f, 18.574f, 21.0158f, 18.7065f, 20.9526f)
        curveTo(19.4576f, 20.5944f, 22f, 19.1918f, 22f, 16.6204f)
        }
        }.build()

        return _folderSecurity!!
    }

private var _folderSecurity: ImageVector? = null
