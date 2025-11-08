package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.CircleArrowMoveLeftDown: ImageVector
    get() {
        if (_circleArrowMoveLeftDown != null) {
            return _circleArrowMoveLeftDown!!
        }
        _circleArrowMoveLeftDown = ImageVector.Builder(
            name = "CircleArrowMoveLeftDown",
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
        moveTo(9.51204f, 11.638f)
        curveTo(8.98182f, 11.0262f, 7.91022f, 10.1593f, 8.01948f, 9.79956f)
        moveTo(8.01948f, 9.79956f)
        curveTo(8.01948f, 9.38054f, 9.07053f, 8.58147f, 9.51204f, 7.99561f)
        moveTo(8.01948f, 9.79956f)
        curveTo(9.93839f, 9.92155f, 12.4115f, 9.54648f, 13.419f, 10.3459f)
        curveTo(14.4795f, 11.233f, 14.0925f, 13.7555f, 14.1988f, 15.9882f)
        moveTo(14.1988f, 15.9882f)
        curveTo(13.6637f, 16.035f, 12.9727f, 15.003f, 12.3644f, 14.4687f)
        moveTo(14.1988f, 15.9882f)
        curveTo(14.5543f, 16.0858f, 15.4634f, 14.9805f, 15.9963f, 14.471f)
        }
        }.build()

        return _circleArrowMoveLeftDown!!
    }

private var _circleArrowMoveLeftDown: ImageVector? = null
