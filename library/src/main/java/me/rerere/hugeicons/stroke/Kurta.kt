package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Kurta: ImageVector
    get() {
        if (_kurta != null) {
            return _kurta!!
        }
        _kurta = ImageVector.Builder(
            name = "Kurta",
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
        moveTo(6.37726f, 16f)
        horizontalLineTo(5.08354f)
        curveTo(3.22665f, 16f, 2.84168f, 15.6255f, 3.05142f, 13.7791f)
        lineTo(3.41559f, 10.5731f)
        curveTo(3.75345f, 7.59878f, 4.43808f, 6.75874f, 7.23391f, 5.66482f)
        lineTo(8.93305f, 5f)
        verticalLineTo(2f)
        curveTo(9.90622f, 2.31731f, 10.9677f, 2.83772f, 12f, 2.83772f)
        curveTo(13.0323f, 2.83772f, 14.0938f, 2.31731f, 15.067f, 2f)
        verticalLineTo(5f)
        lineTo(16.7661f, 5.66482f)
        curveTo(19.5619f, 6.75874f, 20.2466f, 7.59878f, 20.5844f, 10.5731f)
        lineTo(20.9486f, 13.7791f)
        curveTo(21.1583f, 15.6255f, 20.7734f, 16f, 18.9165f, 16f)
        horizontalLineTo(17.6227f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(9f, 5f)
        lineTo(11.0513f, 5.68377f)
        curveTo(11.6671f, 5.88904f, 12.3329f, 5.88904f, 12.9487f, 5.68377f)
        lineTo(15f, 5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(6.9642f, 10f)
        lineTo(6.50433f, 20.9584f)
        curveTo(6.4681f, 21.8215f, 6.64698f, 22f, 7.51062f, 22f)
        horizontalLineTo(16.4894f)
        curveTo(17.353f, 22f, 17.5319f, 21.8215f, 17.4957f, 20.9584f)
        lineTo(17.0358f, 10f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 13f)
        lineTo(12f, 6f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 9f)
        horizontalLineTo(13f)
        moveTo(12f, 11.5f)
        horizontalLineTo(13f)
        }
        }.build()

        return _kurta!!
    }

private var _kurta: ImageVector? = null
