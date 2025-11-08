package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Sushi01: ImageVector
    get() {
        if (_sushi01 != null) {
            return _sushi01!!
        }
        _sushi01 = ImageVector.Builder(
            name = "Sushi01",
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
        moveTo(20f, 13f)
        curveTo(20f, 16.0024f, 20f, 17.5036f, 19.1213f, 18.4363f)
        curveTo(17.0344f, 20.6515f, 6.71606f, 20.3867f, 4.87868f, 18.4363f)
        curveTo(4f, 17.5036f, 4f, 16.0024f, 4f, 13f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12.04f, 4f)
        curveTo(4.4529f, 4f, 2.47653f, 8.7964f, 2.03855f, 12.6325f)
        curveTo(1.851f, 14.2752f, 2.33921f, 14.2488f, 3.69248f, 13.5405f)
        curveTo(5.76039f, 12.458f, 8.50919f, 11.766f, 12.04f, 11.766f)
        curveTo(15.5657f, 11.766f, 18.2639f, 12.456f, 20.3076f, 13.5357f)
        curveTo(21.6586f, 14.2494f, 22.1436f, 14.2742f, 21.9641f, 12.6322f)
        curveTo(21.5448f, 8.7961f, 19.6269f, 4f, 12.04f, 4f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(6.99609f, 12f)
        curveTo(6.99609f, 9.47222f, 7.8828f, 4.56415f, 12.9961f, 4f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15f, 12f)
        curveTo(15f, 10.0614f, 15.5118f, 6.73584f, 18f, 5f)
        }
        }.build()

        return _sushi01!!
    }

private var _sushi01: ImageVector? = null
