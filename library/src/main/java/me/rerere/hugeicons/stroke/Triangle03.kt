package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Triangle03: ImageVector
    get() {
        if (_triangle03 != null) {
            return _triangle03!!
        }
        _triangle03 = ImageVector.Builder(
            name = "Triangle03",
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
        moveTo(3f, 17.3362f)
        verticalLineTo(7.10375f)
        curveTo(3f, 5.22156f, 3f, 4.28046f, 3.56858f, 4.04626f)
        curveTo(4.13717f, 3.81205f, 4.80633f, 4.47751f, 6.14468f, 5.80841f)
        lineTo(18.2764f, 17.8728f)
        curveTo(19.6148f, 19.2037f, 20.2839f, 19.8692f, 20.0484f, 20.4346f)
        curveTo(19.8129f, 21f, 18.8665f, 21f, 16.9739f, 21f)
        horizontalLineTo(6.68422f)
        curveTo(4.94747f, 21f, 4.07908f, 21f, 3.53955f, 20.4635f)
        curveTo(3f, 19.9269f, 3f, 19.0634f, 3f, 17.3362f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(20.9159f, 12.8369f)
        lineTo(17.4805f, 9.42001f)
        moveTo(20.9159f, 12.8369f)
        curveTo(21.078f, 12.6772f, 20.9581f, 11.3527f, 20.9461f, 10.5134f)
        moveTo(20.9159f, 12.8369f)
        curveTo(20.7539f, 12.9967f, 19.9987f, 12.8894f, 18.6077f, 12.8184f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(11.129f, 3.08307f)
        lineTo(14.5645f, 6.5f)
        moveTo(11.129f, 3.08307f)
        curveTo(10.967f, 3.24282f, 11.0868f, 4.56733f, 11.0988f, 5.40659f)
        moveTo(11.129f, 3.08307f)
        curveTo(11.2911f, 2.92332f, 12.0462f, 3.03064f, 13.4372f, 3.10157f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(20.9087f, 3.08363f)
        lineTo(17.4727f, 6.5f)
        moveTo(20.9087f, 3.08363f)
        curveTo(20.748f, 2.92247f, 19.4161f, 3.04169f, 18.5722f, 3.05362f)
        moveTo(20.9087f, 3.08363f)
        curveTo(21.0693f, 3.24479f, 20.9614f, 3.99571f, 20.8901f, 5.37903f)
        }
        }.build()

        return _triangle03!!
    }

private var _triangle03: ImageVector? = null
