package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Coffee04: ImageVector
    get() {
        if (_coffee04 != null) {
            return _coffee04!!
        }
        _coffee04 = ImageVector.Builder(
            name = "Coffee04",
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
        moveTo(17f, 9f)
        horizontalLineTo(4.33333f)
        curveTo(4.02334f, 9f, 3.86835f, 9f, 3.74118f, 9.03407f)
        curveTo(3.39609f, 9.12654f, 3.12654f, 9.39609f, 3.03407f, 9.74118f)
        curveTo(3f, 9.86835f, 3f, 10.0233f, 3f, 10.3333f)
        verticalLineTo(14f)
        curveTo(3f, 17.866f, 6.13401f, 21f, 10f, 21f)
        curveTo(13.866f, 21f, 17f, 17.866f, 17f, 14f)
        verticalLineTo(9f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(17f, 9f)
        horizontalLineTo(18f)
        curveTo(19.6569f, 9f, 21f, 10.3431f, 21f, 12f)
        curveTo(21f, 13.6569f, 19.6569f, 15f, 18f, 15f)
        horizontalLineTo(17f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(10f, 3f)
        verticalLineTo(5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(14f, 3f)
        verticalLineTo(5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(6f, 3f)
        verticalLineTo(5f)
        }
        }.build()

        return _coffee04!!
    }

private var _coffee04: ImageVector? = null
