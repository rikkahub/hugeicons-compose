package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Rocket01: ImageVector
    get() {
        if (_rocket01 != null) {
            return _rocket01!!
        }
        _rocket01 = ImageVector.Builder(
            name = "Rocket01",
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
        moveTo(11.8013f, 6.48949f)
        lineTo(13.2869f, 5.00392f)
        curveTo(14.9596f, 3.3312f, 17.1495f, 2.63737f, 19.4671f, 2.52399f)
        curveTo(20.3686f, 2.47989f, 20.8193f, 2.45784f, 21.1807f, 2.81928f)
        curveTo(21.5422f, 3.18071f, 21.5201f, 3.63143f, 21.476f, 4.53289f)
        curveTo(21.3626f, 6.8505f, 20.6688f, 9.04042f, 18.9961f, 10.7131f)
        lineTo(17.5105f, 12.1987f)
        curveTo(16.2871f, 13.4221f, 15.9393f, 13.77f, 16.1961f, 15.097f)
        curveTo(16.4496f, 16.1107f, 16.6949f, 17.0923f, 15.9578f, 17.8294f)
        curveTo(15.0637f, 18.7235f, 14.2481f, 18.7235f, 13.354f, 17.8294f)
        lineTo(6.17058f, 10.646f)
        curveTo(5.27649f, 9.75188f, 5.27646f, 8.9363f, 6.17058f, 8.04219f)
        curveTo(6.90767f, 7.30509f, 7.88929f, 7.55044f, 8.90297f, 7.80389f)
        curveTo(10.23f, 8.06073f, 10.5779f, 7.71289f, 11.8013f, 6.48949f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(16.9959f, 7f)
        horizontalLineTo(17.0049f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(2.5f, 21.5f)
        lineTo(7.5f, 16.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(8.5f, 21.5f)
        lineTo(10.5f, 19.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(2.5f, 15.5f)
        lineTo(4.5f, 13.5f)
        }
        }.build()

        return _rocket01!!
    }

private var _rocket01: ImageVector? = null
