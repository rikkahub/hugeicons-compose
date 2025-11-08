package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Attachment: ImageVector
    get() {
        if (_attachment != null) {
            return _attachment!!
        }
        _attachment = ImageVector.Builder(
            name = "Attachment",
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
        moveTo(19.5f, 12.0001f)
        verticalLineTo(13.5001f)
        curveTo(19.5f, 17.6422f, 16.1421f, 21.0001f, 12f, 21.0001f)
        curveTo(7.85786f, 21.0001f, 4.5f, 17.6422f, 4.5f, 13.5001f)
        verticalLineTo(8f)
        curveTo(4.5f, 5.23858f, 6.73858f, 3f, 9.5f, 3f)
        curveTo(12.2614f, 3f, 14.5f, 5.23858f, 14.5f, 8f)
        verticalLineTo(13.5f)
        curveTo(14.5f, 14.8807f, 13.3807f, 16f, 12f, 16f)
        curveTo(10.6193f, 16f, 9.5f, 14.8807f, 9.5f, 13.5f)
        verticalLineTo(9.5f)
        }
        }.build()

        return _attachment!!
    }

private var _attachment: ImageVector? = null
