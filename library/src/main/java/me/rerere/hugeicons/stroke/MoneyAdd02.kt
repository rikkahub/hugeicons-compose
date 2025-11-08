package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.MoneyAdd02: ImageVector
    get() {
        if (_moneyAdd02 != null) {
            return _moneyAdd02!!
        }
        _moneyAdd02 = ImageVector.Builder(
            name = "MoneyAdd02",
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
        moveTo(14.4998f, 11f)
        curveTo(14.4998f, 12.3807f, 13.3805f, 13.5f, 11.9998f, 13.5f)
        curveTo(10.6191f, 13.5f, 9.49982f, 12.3807f, 9.49982f, 11f)
        curveTo(9.49982f, 9.61929f, 10.6191f, 8.5f, 11.9998f, 8.5f)
        curveTo(13.3805f, 8.5f, 14.4998f, 9.61929f, 14.4998f, 11f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(22f, 13f)
        verticalLineTo(5.92705f)
        curveTo(22f, 5.35889f, 21.6756f, 4.84452f, 21.1329f, 4.67632f)
        curveTo(20.1903f, 4.38421f, 18.4794f, 4f, 16f, 4f)
        curveTo(11.4209f, 4f, 10.1967f, 5.67747f, 3.87798f, 4.42361f)
        curveTo(2.92079f, 4.23366f, 2f, 4.94531f, 2f, 5.92116f)
        verticalLineTo(15.9382f)
        curveTo(2f, 16.6265f, 2.47265f, 17.231f, 3.1448f, 17.3792f)
        curveTo(8.39034f, 18.536f, 10.3316f, 17.7972f, 13f, 17.362f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(2f, 8f)
        curveTo(3.95133f, 8f, 5.70483f, 6.40507f, 5.92901f, 4.75417f)
        moveTo(18.5005f, 4.5f)
        curveTo(18.5005f, 6.53964f, 20.2655f, 8.46899f, 22f, 8.46899f)
        moveTo(6.00049f, 17.4961f)
        curveTo(6.00049f, 15.287f, 4.20963f, 13.4961f, 2.00049f, 13.4961f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(19f, 14f)
        verticalLineTo(20f)
        moveTo(16f, 17f)
        horizontalLineTo(22f)
        }
        }.build()

        return _moneyAdd02!!
    }

private var _moneyAdd02: ImageVector? = null
