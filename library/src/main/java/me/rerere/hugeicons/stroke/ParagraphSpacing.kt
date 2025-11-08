package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.ParagraphSpacing: ImageVector
    get() {
        if (_paragraphSpacing != null) {
            return _paragraphSpacing!!
        }
        _paragraphSpacing = ImageVector.Builder(
            name = "ParagraphSpacing",
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
        moveTo(3f, 2f)
        horizontalLineTo(21f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(3f, 22f)
        horizontalLineTo(21f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(9.47266f, 8.50877f)
        lineTo(11.2737f, 6.37445f)
        curveTo(11.6424f, 5.93292f, 12.2676f, 5.92911f, 12.6732f, 6.37445f)
        lineTo(14.4529f, 8.50877f)
        moveTo(11.9734f, 7.08442f)
        verticalLineTo(11.4079f)
        lineTo(11.9719f, 16.9993f)
        moveTo(14.4727f, 15.575f)
        lineTo(12.6716f, 17.7093f)
        curveTo(12.3029f, 18.1508f, 11.6777f, 18.1546f, 11.2721f, 17.7093f)
        lineTo(9.4924f, 15.575f)
        }
        }.build()

        return _paragraphSpacing!!
    }

private var _paragraphSpacing: ImageVector? = null
