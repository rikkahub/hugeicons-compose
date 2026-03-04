package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.GasStove: ImageVector
    get() {
        if (_gasStove != null) {
            return _gasStove!!
        }
        _gasStove = ImageVector.Builder(
            name = "GasStove",
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
        moveTo(2f, 6f)
        curveTo(2f, 2.69067f, 2.69067f, 2f, 6f, 2f)
        horizontalLineTo(18f)
        curveTo(21.3093f, 2f, 22f, 2.69067f, 22f, 6f)
        verticalLineTo(18f)
        curveTo(22f, 21.3093f, 21.3093f, 22f, 18f, 22f)
        horizontalLineTo(6f)
        curveTo(2.69067f, 22f, 2f, 21.3093f, 2f, 18f)
        verticalLineTo(6f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(6f, 19f)
        horizontalLineTo(10f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(18f, 19.0089f)
        verticalLineTo(19f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15.5f, 10f)
        horizontalLineTo(17f)
        moveTo(12f, 13.5f)
        verticalLineTo(15f)
        moveTo(8.5f, 10f)
        horizontalLineTo(7f)
        moveTo(12f, 6.5f)
        verticalLineTo(5f)
        }
        }.build()

        return _gasStove!!
    }

private var _gasStove: ImageVector? = null
