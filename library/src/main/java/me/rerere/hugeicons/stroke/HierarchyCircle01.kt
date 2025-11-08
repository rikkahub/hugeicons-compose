package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.HierarchyCircle01: ImageVector
    get() {
        if (_hierarchyCircle01 != null) {
            return _hierarchyCircle01!!
        }
        _hierarchyCircle01 = ImageVector.Builder(
            name = "HierarchyCircle01",
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
        moveTo(15f, 5f)
        curveTo(15f, 6.65685f, 13.6569f, 8f, 12f, 8f)
        curveTo(10.3431f, 8f, 9f, 6.65685f, 9f, 5f)
        curveTo(9f, 3.34315f, 10.3431f, 2f, 12f, 2f)
        curveTo(13.6569f, 2f, 15f, 3.34315f, 15f, 5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(8f, 19f)
        curveTo(8f, 20.6569f, 6.65685f, 22f, 5f, 22f)
        curveTo(3.34315f, 22f, 2f, 20.6569f, 2f, 19f)
        curveTo(2f, 17.3431f, 3.34315f, 16f, 5f, 16f)
        curveTo(6.65685f, 16f, 8f, 17.3431f, 8f, 19f)
        }

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
        moveTo(12f, 8f)
        verticalLineTo(12f)
        moveTo(12f, 12f)
        horizontalLineTo(8.5f)
        curveTo(6.85008f, 12f, 6.02513f, 12f, 5.51256f, 12.4393f)
        curveTo(5f, 12.8787f, 5f, 13.5858f, 5f, 15f)
        verticalLineTo(16f)
        moveTo(12f, 12f)
        horizontalLineTo(15.5f)
        curveTo(17.1499f, 12f, 17.9749f, 12f, 18.4874f, 12.4393f)
        curveTo(19f, 12.8787f, 19f, 13.5858f, 19f, 15f)
        verticalLineTo(16f)
        }
        }.build()

        return _hierarchyCircle01!!
    }

private var _hierarchyCircle01: ImageVector? = null
