package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.CircleArrowMoveUpLeft: ImageVector
    get() {
        if (_circleArrowMoveUpLeft != null) {
            return _circleArrowMoveUpLeft!!
        }
        _circleArrowMoveUpLeft = ImageVector.Builder(
            name = "CircleArrowMoveUpLeft",
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
        moveTo(12f, 22f)
        curveTo(17.5228f, 22f, 22f, 17.5228f, 22f, 12f)
        curveTo(22f, 6.47715f, 17.5228f, 2f, 12f, 2f)
        curveTo(6.47715f, 2f, 2f, 6.47715f, 2f, 12f)
        curveTo(2f, 17.5228f, 6.47715f, 22f, 12f, 22f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(10.3691f, 11.474f)
        curveTo(9.86083f, 10.8438f, 8.82805f, 10.0631f, 9.01189f, 9.69249f)
        moveTo(9.01189f, 9.69249f)
        curveTo(8.90948f, 9.31454f, 9.90942f, 8.56745f, 10.3714f, 7.99756f)
        moveTo(9.01189f, 9.69249f)
        curveTo(11.0947f, 9.64717f, 12.369f, 9.89913f, 13.5991f, 11.124f)
        curveTo(14.8802f, 12.3997f, 15.091f, 13.7936f, 14.9873f, 16.0022f)
        }
        }.build()

        return _circleArrowMoveUpLeft!!
    }

private var _circleArrowMoveUpLeft: ImageVector? = null
