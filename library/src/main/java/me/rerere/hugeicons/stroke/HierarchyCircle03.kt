package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.HierarchyCircle03: ImageVector
    get() {
        if (_hierarchyCircle03 != null) {
            return _hierarchyCircle03!!
        }
        _hierarchyCircle03 = ImageVector.Builder(
            name = "HierarchyCircle03",
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
        moveTo(22f, 19f)
        curveTo(22f, 20.6569f, 20.6569f, 22f, 19f, 22f)
        curveTo(17.3431f, 22f, 16f, 20.6569f, 16f, 19f)
        curveTo(16f, 17.3431f, 17.3431f, 16f, 19f, 16f)
        curveTo(20.6569f, 16f, 22f, 17.3431f, 22f, 19f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(22f, 5f)
        curveTo(22f, 6.65685f, 20.6569f, 8f, 19f, 8f)
        curveTo(17.3431f, 8f, 16f, 6.65685f, 16f, 5f)
        curveTo(16f, 3.34315f, 17.3431f, 2f, 19f, 2f)
        curveTo(20.6569f, 2f, 22f, 3.34315f, 22f, 5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(16f, 5f)
        curveTo(13.547f, 5.1828f, 13f, 6.20315f, 13f, 9.65278f)
        verticalLineTo(12f)
        moveTo(16f, 19f)
        curveTo(13.547f, 18.8172f, 13f, 17.7969f, 13f, 14.3472f)
        lineTo(13f, 12f)
        moveTo(13f, 12f)
        horizontalLineTo(10f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(10f, 12f)
        curveTo(10f, 14.2091f, 8.20914f, 16f, 6f, 16f)
        curveTo(3.79086f, 16f, 2f, 14.2091f, 2f, 12f)
        curveTo(2f, 9.79086f, 3.79086f, 8f, 6f, 8f)
        curveTo(8.20914f, 8f, 10f, 9.79086f, 10f, 12f)
        }
        }.build()

        return _hierarchyCircle03!!
    }

private var _hierarchyCircle03: ImageVector? = null
