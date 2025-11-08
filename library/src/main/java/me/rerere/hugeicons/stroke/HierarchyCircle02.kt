package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.HierarchyCircle02: ImageVector
    get() {
        if (_hierarchyCircle02 != null) {
            return _hierarchyCircle02!!
        }
        _hierarchyCircle02 = ImageVector.Builder(
            name = "HierarchyCircle02",
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
        moveTo(5f, 22f)
        curveTo(3.34315f, 22f, 2f, 20.6569f, 2f, 19f)
        curveTo(2f, 17.3431f, 3.34315f, 16f, 5f, 16f)
        curveTo(6.65685f, 16f, 8f, 17.3431f, 8f, 19f)
        curveTo(8f, 20.6569f, 6.65685f, 22f, 5f, 22f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(19f, 22f)
        curveTo(17.3431f, 22f, 16f, 20.6569f, 16f, 19f)
        curveTo(16f, 17.3431f, 17.3431f, 16f, 19f, 16f)
        curveTo(20.6569f, 16f, 22f, 17.3431f, 22f, 19f)
        curveTo(22f, 20.6569f, 20.6569f, 22f, 19f, 22f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(19f, 16f)
        curveTo(18.8172f, 13.547f, 17.7969f, 13f, 14.3472f, 13f)
        lineTo(9.65278f, 13f)
        curveTo(6.20315f, 13f, 5.1828f, 13.547f, 5f, 16f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 10f)
        curveTo(9.79086f, 10f, 8f, 8.20914f, 8f, 6f)
        curveTo(8f, 3.79086f, 9.79086f, 2f, 12f, 2f)
        curveTo(14.2091f, 2f, 16f, 3.79086f, 16f, 6f)
        curveTo(16f, 8.20914f, 14.2091f, 10f, 12f, 10f)
        }
        }.build()

        return _hierarchyCircle02!!
    }

private var _hierarchyCircle02: ImageVector? = null
