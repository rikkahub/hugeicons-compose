package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.SchoolBell01: ImageVector
    get() {
        if (_schoolBell01 != null) {
            return _schoolBell01!!
        }
        _schoolBell01 = ImageVector.Builder(
            name = "SchoolBell01",
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
        moveTo(18f, 7f)
        curveTo(16.807f, 4.06817f, 13.9174f, 2f, 10.5423f, 2f)
        curveTo(6.10066f, 2f, 2.5f, 5.58172f, 2.5f, 10f)
        curveTo(2.5f, 14.4183f, 6.10066f, 18f, 10.5423f, 18f)
        curveTo(12.2197f, 18f, 13.7772f, 17.4892f, 15.0661f, 16.6153f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(21.5f, 13f)
        curveTo(21.5f, 18.1004f, 17.1065f, 21.595f, 11.4999f, 21.9671f)
        curveTo(11.0444f, 21.9973f, 10.8167f, 22.0124f, 10.6584f, 21.8642f)
        curveTo(10.5f, 21.716f, 10.5f, 21.4773f, 10.5f, 21f)
        verticalLineTo(18f)
        }
        }.build()

        return _schoolBell01!!
    }

private var _schoolBell01: ImageVector? = null
