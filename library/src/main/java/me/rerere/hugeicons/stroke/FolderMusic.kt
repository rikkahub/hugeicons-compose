package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.FolderMusic: ImageVector
    get() {
        if (_folderMusic != null) {
            return _folderMusic!!
        }
        _folderMusic = ImageVector.Builder(
            name = "FolderMusic",
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
        moveTo(12.9995f, 21f)
        horizontalLineTo(11.9995f)
        curveTo(7.28547f, 21f, 4.92844f, 21f, 3.46398f, 19.5355f)
        curveTo(1.99951f, 18.0711f, 1.99951f, 15.714f, 1.99951f, 11f)
        verticalLineTo(7.94427f)
        curveTo(1.99951f, 6.1278f, 1.99951f, 5.21956f, 2.37983f, 4.53806f)
        curveTo(2.65093f, 4.05227f, 3.05178f, 3.65142f, 3.53757f, 3.38032f)
        curveTo(4.21907f, 3f, 5.12731f, 3f, 6.94378f, 3f)
        curveTo(8.10753f, 3f, 8.68941f, 3f, 9.19877f, 3.19101f)
        curveTo(10.3617f, 3.62712f, 10.8413f, 4.68358f, 11.3661f, 5.73313f)
        lineTo(11.9995f, 7f)
        moveTo(7.99951f, 7f)
        horizontalLineTo(16.7495f)
        curveTo(18.8562f, 7f, 19.9096f, 7f, 20.6662f, 7.50559f)
        curveTo(20.9938f, 7.72447f, 21.275f, 8.00572f, 21.4939f, 8.33329f)
        curveTo(21.9791f, 9.05942f, 21.9987f, 10.0588f, 21.9995f, 12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(19.3966f, 18.7446f)
        curveTo(19.3966f, 19.9885f, 18.4123f, 20.9969f, 17.198f, 20.9969f)
        curveTo(15.9838f, 20.9969f, 14.9995f, 19.9885f, 14.9995f, 18.7446f)
        curveTo(14.9995f, 17.5007f, 15.9838f, 16.4923f, 17.198f, 16.4923f)
        curveTo(18.4123f, 16.4923f, 19.3966f, 17.5007f, 19.3966f, 18.7446f)
        moveTo(19.3966f, 18.7446f)
        verticalLineTo(13f)
        curveTo(19.3966f, 13f, 20.7036f, 15.6999f, 22.0005f, 15.6999f)
        }
        }.build()

        return _folderMusic!!
    }

private var _folderMusic: ImageVector? = null
