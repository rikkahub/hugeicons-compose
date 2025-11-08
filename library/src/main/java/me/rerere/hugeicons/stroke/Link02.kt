package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Link02: ImageVector
    get() {
        if (_link02 != null) {
            return _link02!!
        }
        _link02 = ImageVector.Builder(
            name = "Link02",
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
        moveTo(9.5f, 14.5f)
        lineTo(14.5f, 9.49995f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(16.8463f, 14.6095f)
        lineTo(19.4558f, 12f)
        curveTo(21.5147f, 9.94108f, 21.5147f, 6.60298f, 19.4558f, 4.54411f)
        curveTo(17.397f, 2.48524f, 14.0589f, 2.48524f, 12f, 4.54411f)
        lineTo(9.39045f, 7.15366f)
        moveTo(14.6095f, 16.8463f)
        lineTo(12f, 19.4558f)
        curveTo(9.94113f, 21.5147f, 6.60303f, 21.5147f, 4.54416f, 19.4558f)
        curveTo(2.48528f, 17.3969f, 2.48528f, 14.0588f, 4.54416f, 12f)
        lineTo(7.1537f, 9.39041f)
        }
        }.build()

        return _link02!!
    }

private var _link02: ImageVector? = null
