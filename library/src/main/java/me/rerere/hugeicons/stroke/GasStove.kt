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
            defaultWidth = 25.dp,
            defaultHeight = 24.dp,
            viewportWidth = 25f,
            viewportHeight = 24f
        ).apply {
        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(2.5f, 6f)
        curveTo(2.5f, 2.69067f, 3.19067f, 2f, 6.5f, 2f)
        horizontalLineTo(18.5f)
        curveTo(21.8093f, 2f, 22.5f, 2.69067f, 22.5f, 6f)
        verticalLineTo(18f)
        curveTo(22.5f, 21.3093f, 21.8093f, 22f, 18.5f, 22f)
        horizontalLineTo(6.5f)
        curveTo(3.19067f, 22f, 2.5f, 21.3093f, 2.5f, 18f)
        verticalLineTo(6f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(6.5f, 19f)
        horizontalLineTo(10.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(18.5f, 19.0089f)
        verticalLineTo(19f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(16f, 10f)
        horizontalLineTo(17.5f)
        moveTo(12.5f, 13.5f)
        verticalLineTo(15f)
        moveTo(9f, 10f)
        horizontalLineTo(7.5f)
        moveTo(12.5f, 6.5f)
        verticalLineTo(5f)
        }
        }.build()

        return _gasStove!!
    }

private var _gasStove: ImageVector? = null
