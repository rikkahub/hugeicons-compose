package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.CircleUnlock01: ImageVector
    get() {
        if (_circleUnlock01 != null) {
            return _circleUnlock01!!
        }
        _circleUnlock01 = ImageVector.Builder(
            name = "CircleUnlock01",
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
        moveTo(5f, 15f)
        curveTo(5f, 11.134f, 8.13401f, 8f, 12f, 8f)
        curveTo(15.866f, 8f, 19f, 11.134f, 19f, 15f)
        curveTo(19f, 18.866f, 15.866f, 22f, 12f, 22f)
        curveTo(8.13401f, 22f, 5f, 18.866f, 5f, 15f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(7.5f, 9.5f)
        verticalLineTo(6.5f)
        curveTo(7.5f, 4.01472f, 9.51472f, 2f, 12f, 2f)
        curveTo(13.5602f, 2f, 14.935f, 2.79401f, 15.7422f, 4f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 15f)
        horizontalLineTo(12.009f)
        }
        }.build()

        return _circleUnlock01!!
    }

private var _circleUnlock01: ImageVector? = null
