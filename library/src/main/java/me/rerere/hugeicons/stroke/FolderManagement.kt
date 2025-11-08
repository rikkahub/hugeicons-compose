package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.FolderManagement: ImageVector
    get() {
        if (_folderManagement != null) {
            return _folderManagement!!
        }
        _folderManagement = ImageVector.Builder(
            name = "FolderManagement",
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
        moveTo(18f, 19.7727f)
        curveTo(19.7673f, 19.7727f, 21.2f, 18.3075f, 21.2f, 16.5f)
        curveTo(21.2f, 14.6925f, 19.7673f, 13.2273f, 18f, 13.2273f)
        moveTo(18f, 19.7727f)
        curveTo(16.2327f, 19.7727f, 14.8f, 18.3075f, 14.8f, 16.5f)
        curveTo(14.8f, 14.6925f, 16.2327f, 13.2273f, 18f, 13.2273f)
        moveTo(18f, 19.7727f)
        verticalLineTo(21f)
        moveTo(18f, 13.2273f)
        verticalLineTo(12f)
        moveTo(15.0913f, 14.7149f)
        lineTo(14.0004f, 14.0455f)
        moveTo(22f, 18.9545f)
        lineTo(20.9092f, 18.2851f)
        moveTo(20.9087f, 14.7149f)
        lineTo(21.9996f, 14.0455f)
        moveTo(14f, 18.9545f)
        lineTo(15.0908f, 18.2851f)
        }
        }.build()

        return _folderManagement!!
    }

private var _folderManagement: ImageVector? = null
