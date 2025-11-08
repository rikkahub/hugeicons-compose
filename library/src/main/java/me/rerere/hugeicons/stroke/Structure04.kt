package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Structure04: ImageVector
    get() {
        if (_structure04 != null) {
            return _structure04!!
        }
        _structure04 = ImageVector.Builder(
            name = "Structure04",
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
        moveTo(2f, 12f)
        curveTo(2f, 9.518f, 2.518f, 9f, 5f, 9f)
        horizontalLineTo(7f)
        curveTo(9.482f, 9f, 10f, 9.518f, 10f, 12f)
        curveTo(10f, 14.482f, 9.482f, 15f, 7f, 15f)
        horizontalLineTo(5f)
        curveTo(2.518f, 15f, 2f, 14.482f, 2f, 12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(14f, 7f)
        curveTo(14f, 4.518f, 14.518f, 4f, 17f, 4f)
        horizontalLineTo(19f)
        curveTo(21.482f, 4f, 22f, 4.518f, 22f, 7f)
        curveTo(22f, 9.482f, 21.482f, 10f, 19f, 10f)
        horizontalLineTo(17f)
        curveTo(14.518f, 10f, 14f, 9.482f, 14f, 7f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(14f, 17f)
        curveTo(14f, 14.518f, 14.518f, 14f, 17f, 14f)
        horizontalLineTo(19f)
        curveTo(21.482f, 14f, 22f, 14.518f, 22f, 17f)
        curveTo(22f, 19.482f, 21.482f, 20f, 19f, 20f)
        horizontalLineTo(17f)
        curveTo(14.518f, 20f, 14f, 19.482f, 14f, 17f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(14f, 7f)
        lineTo(11f, 12f)
        lineTo(14f, 17f)
        }
        }.build()

        return _structure04!!
    }

private var _structure04: ImageVector? = null
