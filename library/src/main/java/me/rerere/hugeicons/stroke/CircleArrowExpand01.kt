package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.CircleArrowExpand01: ImageVector
    get() {
        if (_circleArrowExpand01 != null) {
            return _circleArrowExpand01!!
        }
        _circleArrowExpand01 = ImageVector.Builder(
            name = "CircleArrowExpand01",
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
        moveTo(7.93668f, 16.0634f)
        curveTo(7.41936f, 15.5461f, 7.50535f, 13.3483f, 7.50535f, 13.3483f)
        moveTo(7.93668f, 16.0634f)
        curveTo(8.45401f, 16.5808f, 10.6517f, 16.4946f, 10.6517f, 16.4946f)
        moveTo(7.93668f, 16.0634f)
        lineTo(11f, 13f)
        moveTo(16.0634f, 7.93661f)
        curveTo(15.5461f, 7.41928f, 13.3484f, 7.50537f, 13.3484f, 7.50537f)
        moveTo(16.0634f, 7.93661f)
        curveTo(16.5808f, 8.45394f, 16.4946f, 10.6516f, 16.4946f, 10.6516f)
        moveTo(16.0634f, 7.93661f)
        lineTo(13f, 11f)
        }
        }.build()

        return _circleArrowExpand01!!
    }

private var _circleArrowExpand01: ImageVector? = null
