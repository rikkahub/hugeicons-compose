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

val HugeIcons.MessageCircleDashed: ImageVector
    get() {
        if (_messageCircleDashed != null) {
            return _messageCircleDashed!!
        }
        _messageCircleDashed = ImageVector.Builder(
            name = "MessageCircleDashed",
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
            moveTo(7.47017f, 20.3687f)
            curveTo(5.60194f, 19.362f, 4.34478f, 20.2979f, 3.23609f, 20.4658f)
            curveTo(3.0679f, 20.4913f, 2.90041f, 20.4302f, 2.78013f, 20.31f)
            curveTo(2.59757f, 20.1274f, 2.56283f, 19.8451f, 2.66367f, 19.6074f)
            curveTo(3.09882f, 18.5818f, 3.49837f, 16.6382f, 2.95357f, 15f)
        }

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
            moveTo(2.52209f, 11f)
            curveTo(3.02179f, 6.22333f, 7.06112f, 2.5f, 11.9701f, 2.5f)
            curveTo(17.2168f, 2.5f, 21.4701f, 6.75329f, 21.4701f, 12f)
            curveTo(21.4701f, 17.2467f, 17.2168f, 21.5f, 11.9701f, 21.5f)
        }
        }.build()

        return _messageCircleDashed!!
    }

private var _messageCircleDashed: ImageVector? = null
