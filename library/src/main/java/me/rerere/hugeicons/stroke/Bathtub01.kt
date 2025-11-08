package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Bathtub01: ImageVector
    get() {
        if (_bathtub01 != null) {
            return _bathtub01!!
        }
        _bathtub01 = ImageVector.Builder(
            name = "Bathtub01",
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
        moveTo(6f, 20f)
        lineTo(5f, 21f)
        moveTo(18f, 20f)
        lineTo(19f, 21f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(3f, 12f)
        verticalLineTo(13f)
        curveTo(3f, 16.2998f, 3f, 17.9497f, 4.02513f, 18.9749f)
        curveTo(5.05025f, 20f, 6.70017f, 20f, 10f, 20f)
        horizontalLineTo(14f)
        curveTo(17.2998f, 20f, 18.9497f, 20f, 19.9749f, 18.9749f)
        curveTo(21f, 17.9497f, 21f, 16.2998f, 21f, 13f)
        verticalLineTo(12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(2f, 12f)
        horizontalLineTo(22f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(4f, 12f)
        verticalLineTo(5.5234f)
        curveTo(4f, 4.12977f, 5.12977f, 3f, 6.5234f, 3f)
        curveTo(7.64166f, 3f, 8.62654f, 3.73598f, 8.94339f, 4.80841f)
        lineTo(9f, 5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(8f, 6f)
        lineTo(10.5f, 4f)
        }
        }.build()

        return _bathtub01!!
    }

private var _bathtub01: ImageVector? = null
