package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.FolderLocked: ImageVector
    get() {
        if (_folderLocked != null) {
            return _folderLocked!!
        }
        _folderLocked = ImageVector.Builder(
            name = "FolderLocked",
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
        moveTo(16.75f, 15.5f)
        verticalLineTo(13.75f)
        curveTo(16.75f, 12.7835f, 17.5335f, 12f, 18.5f, 12f)
        curveTo(19.4665f, 12f, 20.25f, 12.7835f, 20.25f, 13.75f)
        verticalLineTo(15.5f)
        moveTo(22f, 18.25f)
        curveTo(22f, 17.0772f, 22f, 16.4908f, 21.69f, 16.0869f)
        curveTo(21.6102f, 15.9829f, 21.5171f, 15.8898f, 21.4131f, 15.81f)
        curveTo(21.0092f, 15.5f, 20.4228f, 15.5f, 19.25f, 15.5f)
        horizontalLineTo(17.75f)
        curveTo(16.5772f, 15.5f, 15.9908f, 15.5f, 15.5869f, 15.81f)
        curveTo(15.4829f, 15.8898f, 15.3898f, 15.9829f, 15.31f, 16.0869f)
        curveTo(15f, 16.4908f, 15f, 17.0772f, 15f, 18.25f)
        curveTo(15f, 19.4228f, 15f, 20.0092f, 15.31f, 20.4131f)
        curveTo(15.3898f, 20.5171f, 15.4829f, 20.6102f, 15.5869f, 20.69f)
        curveTo(15.9908f, 21f, 16.5772f, 21f, 17.75f, 21f)
        horizontalLineTo(19.25f)
        curveTo(20.4228f, 21f, 21.0092f, 21f, 21.4131f, 20.69f)
        curveTo(21.5171f, 20.6102f, 21.6102f, 20.5171f, 21.69f, 20.4131f)
        curveTo(22f, 20.0092f, 22f, 19.4228f, 22f, 18.25f)
        }
        }.build()

        return _folderLocked!!
    }

private var _folderLocked: ImageVector? = null
