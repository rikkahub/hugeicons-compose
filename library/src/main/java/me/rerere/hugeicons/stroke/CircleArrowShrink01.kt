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

val HugeIcons.CircleArrowShrink01: ImageVector
    get() {
        if (_circleArrowShrink01 != null) {
            return _circleArrowShrink01!!
        }
        _circleArrowShrink01 = ImageVector.Builder(
            name = "CircleArrowShrink01",
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
            strokeLineCap = StrokeCap.Butt,
            strokeLineJoin = StrokeJoin.Miter,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(22f, 12f)
            arcTo(10f, 10f, 0f, true, false, 2f, 12f)
            arcTo(10f, 10f, 0f, true, false, 22f, 12f)
            close()
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
            moveTo(11.115f, 11.1151f)
            curveTo(11.6324f, 10.5977f, 11.5463f, 8.4f, 11.5463f, 8.4f)
            moveTo(11.115f, 11.1151f)
            curveTo(10.5977f, 11.6324f, 8.4f, 11.5462f, 8.4f, 11.5462f)
            moveTo(11.115f, 11.1151f)
            lineTo(7.5f, 7.5f)
            moveTo(12.8882f, 12.8882f)
            curveTo(13.4055f, 12.3708f, 15.6032f, 12.4569f, 15.6032f, 12.4569f)
            moveTo(12.8882f, 12.8882f)
            curveTo(12.3709f, 13.4055f, 12.457f, 15.6032f, 12.457f, 15.6032f)
            moveTo(12.8882f, 12.8882f)
            lineTo(16.5f, 16.5f)
        }
        }.build()

        return _circleArrowShrink01!!
    }

private var _circleArrowShrink01: ImageVector? = null
