package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.MessageSquareDashed: ImageVector
    get() {
        if (_messageSquareDashed != null) {
            return _messageSquareDashed!!
        }
        _messageSquareDashed = ImageVector.Builder(
            name = "MessageSquareDashed",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(2.03909f, 8.24024f)
            curveTo(2.03617f, 8.32299f, 2.03341f, 8.40609f, 2.03081f, 8.4895f)
            curveTo(2.01057f, 9.13838f, 2f, 9.80695f, 2f, 10.4899f)
            moveTo(22f, 10.4899f)
            curveTo(22f, 9.8071f, 21.9894f, 9.13868f, 21.9692f, 8.48993f)
            moveTo(8f, 18.4118f)
            verticalLineTo(20.76f)
            curveTo(8f, 21.1631f, 8.32679f, 21.4899f, 8.72991f, 21.4899f)
            curveTo(8.90419f, 21.4899f, 9.07273f, 21.4276f, 9.20503f, 21.3141f)
            lineTo(11.3845f, 19.4452f)
            curveTo(11.9325f, 18.9754f, 12.2064f, 18.7405f, 12.532f, 18.6165f)
            curveTo(12.8576f, 18.4925f, 13.2282f, 18.4855f, 13.9693f, 18.4714f)
            curveTo(14.6638f, 18.4583f, 15.342f, 18.4382f, 16f, 18.4118f)
            moveTo(14f, 2.50903f)
            curveTo(14.6838f, 2.52221f, 15.3517f, 2.54204f, 16f, 2.56802f)
            moveTo(20f, 3.09558f)
            curveTo(20.3223f, 3.24384f, 20.6057f, 3.44112f, 20.8699f, 3.70739f)
            curveTo(21.1106f, 3.9499f, 21.2939f, 4.20572f, 21.4348f, 4.48993f)
            moveTo(21.8781f, 14.4899f)
            curveTo(21.7797f, 15.7669f, 21.5624f, 16.5748f, 20.8699f, 17.2725f)
            curveTo(20.6057f, 17.5387f, 20.3223f, 17.736f, 20f, 17.8843f)
            moveTo(10f, 2.50903f)
            curveTo(9.31624f, 2.52221f, 8.64834f, 2.54204f, 8f, 2.56802f)
            moveTo(4f, 3.09558f)
            curveTo(3.67772f, 3.24384f, 3.39434f, 3.44112f, 3.13007f, 3.70739f)
            curveTo(2.88949f, 3.94978f, 2.70626f, 4.20547f, 2.56545f, 4.4895f)
            moveTo(2.12184f, 14.4895f)
            curveTo(2.22024f, 15.7668f, 2.43751f, 16.5747f, 3.13007f, 17.2725f)
            curveTo(3.39434f, 17.5387f, 3.67772f, 17.736f, 4f, 17.8843f)
        }
        }.build()

        return _messageSquareDashed!!
    }

private var _messageSquareDashed: ImageVector? = null
