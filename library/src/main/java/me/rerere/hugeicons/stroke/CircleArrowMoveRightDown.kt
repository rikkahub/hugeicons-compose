package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.CircleArrowMoveRightDown: ImageVector
    get() {
        if (_circleArrowMoveRightDown != null) {
            return _circleArrowMoveRightDown!!
        }
        _circleArrowMoveRightDown = ImageVector.Builder(
            name = "CircleArrowMoveRightDown",
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
        moveTo(14.4921f, 11.6432f)
        curveTo(15.0223f, 11.0313f, 16.0939f, 10.1644f, 15.9847f, 9.80468f)
        moveTo(15.9847f, 9.80468f)
        curveTo(15.9847f, 9.38566f, 14.9336f, 8.5866f, 14.4921f, 8.00073f)
        moveTo(15.9847f, 9.80468f)
        curveTo(14.0658f, 9.92668f, 11.5926f, 9.5516f, 10.5852f, 10.351f)
        curveTo(9.52468f, 11.2381f, 9.91163f, 13.7606f, 9.80534f, 15.9933f)
        moveTo(9.80534f, 15.9933f)
        curveTo(10.3405f, 16.0402f, 11.0315f, 15.0081f, 11.6398f, 14.4738f)
        moveTo(9.80534f, 15.9933f)
        curveTo(9.44987f, 16.0909f, 8.54077f, 14.9856f, 8.00781f, 14.4762f)
        }
        }.build()

        return _circleArrowMoveRightDown!!
    }

private var _circleArrowMoveRightDown: ImageVector? = null
