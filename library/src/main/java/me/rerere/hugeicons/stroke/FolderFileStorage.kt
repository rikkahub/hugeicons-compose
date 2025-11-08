package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.FolderFileStorage: ImageVector
    get() {
        if (_folderFileStorage != null) {
            return _folderFileStorage!!
        }
        _folderFileStorage = ImageVector.Builder(
            name = "FolderFileStorage",
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
        moveTo(12.0027f, 21f)
        curveTo(7.2874f, 21f, 4.92973f, 21f, 3.46487f, 19.5355f)
        curveTo(2f, 18.0711f, 2f, 15.714f, 2f, 11f)
        verticalLineTo(7.94427f)
        curveTo(2f, 6.1278f, 2f, 5.21956f, 2.38042f, 4.53806f)
        curveTo(2.6516f, 4.05227f, 3.05255f, 3.65142f, 3.53848f, 3.38032f)
        curveTo(4.22017f, 3f, 5.12865f, 3f, 6.94562f, 3f)
        curveTo(8.10969f, 3f, 8.69172f, 3f, 9.20122f, 3.19101f)
        curveTo(10.3645f, 3.62712f, 10.8442f, 4.68358f, 11.3691f, 5.73313f)
        lineTo(12.0027f, 7f)
        moveTo(8.00164f, 7f)
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
        moveTo(22f, 18f)
        verticalLineTo(16.7426f)
        curveTo(22f, 16.1295f, 22f, 15.823f, 21.8858f, 15.5473f)
        curveTo(21.7716f, 15.2716f, 21.5549f, 15.0549f, 21.1213f, 14.6213f)
        lineTo(20.3787f, 13.8787f)
        curveTo(19.9451f, 13.4451f, 19.7284f, 13.2284f, 19.4527f, 13.1142f)
        curveTo(19.177f, 13f, 18.8705f, 13f, 18.2574f, 13f)
        curveTo(16.8431f, 13f, 15.8787f, 13f, 15.4393f, 13.4393f)
        curveTo(15f, 13.8787f, 15f, 14.5858f, 15f, 16f)
        verticalLineTo(18f)
        curveTo(15f, 19.4142f, 15f, 20.1213f, 15.4393f, 20.5607f)
        curveTo(15.8787f, 21f, 16.5858f, 21f, 18f, 21f)
        horizontalLineTo(19f)
        curveTo(20.4142f, 21f, 21.1213f, 21f, 21.5607f, 20.5607f)
        curveTo(22f, 20.1213f, 22f, 19.4142f, 22f, 18f)
        }
        }.build()

        return _folderFileStorage!!
    }

private var _folderFileStorage: ImageVector? = null
