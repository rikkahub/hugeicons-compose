package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.BarCode02: ImageVector
    get() {
        if (_barCode02 != null) {
            return _barCode02!!
        }
        _barCode02 = ImageVector.Builder(
            name = "BarCode02",
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
        moveTo(2f, 4f)
        verticalLineTo(20f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(5f, 4f)
        verticalLineTo(20f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15f, 4f)
        verticalLineTo(20f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(8f, 18f)
        verticalLineTo(6f)
        curveTo(8f, 5.05719f, 8f, 4.58579f, 8.29289f, 4.29289f)
        curveTo(8.58579f, 4f, 9.05719f, 4f, 10f, 4f)
        curveTo(10.9428f, 4f, 11.4142f, 4f, 11.7071f, 4.29289f)
        curveTo(12f, 4.58579f, 12f, 5.05719f, 12f, 6f)
        verticalLineTo(18f)
        curveTo(12f, 18.9428f, 12f, 19.4142f, 11.7071f, 19.7071f)
        curveTo(11.4142f, 20f, 10.9428f, 20f, 10f, 20f)
        curveTo(9.05719f, 20f, 8.58579f, 20f, 8.29289f, 19.7071f)
        curveTo(8f, 19.4142f, 8f, 18.9428f, 8f, 18f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(18f, 18f)
        verticalLineTo(6f)
        curveTo(18f, 5.05719f, 18f, 4.58579f, 18.2929f, 4.29289f)
        curveTo(18.5858f, 4f, 19.0572f, 4f, 20f, 4f)
        curveTo(20.9428f, 4f, 21.4142f, 4f, 21.7071f, 4.29289f)
        curveTo(22f, 4.58579f, 22f, 5.05719f, 22f, 6f)
        verticalLineTo(18f)
        curveTo(22f, 18.9428f, 22f, 19.4142f, 21.7071f, 19.7071f)
        curveTo(21.4142f, 20f, 20.9428f, 20f, 20f, 20f)
        curveTo(19.0572f, 20f, 18.5858f, 20f, 18.2929f, 19.7071f)
        curveTo(18f, 19.4142f, 18f, 18.9428f, 18f, 18f)
        }
        }.build()

        return _barCode02!!
    }

private var _barCode02: ImageVector? = null
