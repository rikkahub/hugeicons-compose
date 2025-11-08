package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.FolderAudio: ImageVector
    get() {
        if (_folderAudio != null) {
            return _folderAudio!!
        }
        _folderAudio = ImageVector.Builder(
            name = "FolderAudio",
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
        moveTo(14f, 21f)
        horizontalLineTo(12.0222f)
        curveTo(7.29769f, 21f, 4.93543f, 21f, 3.46772f, 19.5355f)
        curveTo(2f, 18.0711f, 2f, 15.714f, 2f, 11f)
        verticalLineTo(7.94427f)
        curveTo(2f, 6.1278f, 2f, 5.21956f, 2.38116f, 4.53806f)
        curveTo(2.65287f, 4.05227f, 3.0546f, 3.65142f, 3.54148f, 3.38032f)
        curveTo(4.22449f, 3f, 5.13474f, 3f, 6.95525f, 3f)
        curveTo(8.12158f, 3f, 8.70475f, 3f, 9.21524f, 3.19101f)
        curveTo(10.3808f, 3.62712f, 10.8614f, 4.68358f, 11.3874f, 5.73313f)
        lineTo(12.0222f, 7f)
        moveTo(8.01332f, 7f)
        horizontalLineTo(16.7827f)
        curveTo(18.8941f, 7f, 19.9498f, 7f, 20.7081f, 7.50559f)
        curveTo(21.0364f, 7.72447f, 21.3183f, 8.00572f, 21.5377f, 8.33329f)
        curveTo(21.8193f, 8.75388f, 21.9444f, 9.26614f, 22f, 10f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(21.9959f, 18.4068f)
        verticalLineTo(15.5932f)
        curveTo(21.9959f, 14.0206f, 21.9959f, 13.2343f, 21.4561f, 13.0386f)
        curveTo(20.9162f, 12.843f, 20.2809f, 13.399f, 19.0102f, 14.511f)
        lineTo(18.4961f, 15f)
        horizontalLineTo(17f)
        curveTo(16.0572f, 15f, 15.5858f, 15f, 15.2929f, 15.2929f)
        curveTo(15f, 15.5858f, 15f, 16.0572f, 15f, 17f)
        curveTo(15f, 17.9428f, 15f, 18.4142f, 15.2929f, 18.7071f)
        curveTo(15.5858f, 19f, 16.0572f, 19f, 17f, 19f)
        horizontalLineTo(18.4961f)
        lineTo(19.0102f, 19.489f)
        curveTo(20.2809f, 20.601f, 20.9162f, 21.157f, 21.4561f, 20.9614f)
        curveTo(21.9959f, 20.7657f, 21.9959f, 19.9794f, 21.9959f, 18.4068f)
        }
        }.build()

        return _folderAudio!!
    }

private var _folderAudio: ImageVector? = null
