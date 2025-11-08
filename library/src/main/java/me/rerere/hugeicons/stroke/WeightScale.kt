package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.WeightScale: ImageVector
    get() {
        if (_weightScale != null) {
            return _weightScale!!
        }
        _weightScale = ImageVector.Builder(
            name = "WeightScale",
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
        moveTo(6.68262f, 5f)
        curveTo(5.31812f, 5.06167f, 4.47505f, 5.2536f, 3.87868f, 5.851f)
        curveTo(3f, 6.73119f, 3f, 8.14783f, 3f, 10.9811f)
        verticalLineTo(15.9897f)
        curveTo(3f, 18.823f, 3f, 20.2396f, 3.87868f, 21.1198f)
        curveTo(4.75736f, 22f, 6.17157f, 22f, 9f, 22f)
        horizontalLineTo(15f)
        curveTo(17.8284f, 22f, 19.2426f, 22f, 20.1213f, 21.1198f)
        curveTo(21f, 20.2396f, 21f, 18.823f, 21f, 15.9897f)
        verticalLineTo(10.9811f)
        curveTo(21f, 8.14783f, 21f, 6.73119f, 20.1213f, 5.851f)
        curveTo(19.5249f, 5.2536f, 18.6819f, 5.06167f, 17.3174f, 5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(7.02532f, 6.54026f)
        curveTo(6.54474f, 4.66034f, 6.30445f, 3.72039f, 6.69501f, 3.03089f)
        curveTo(6.79898f, 2.84733f, 6.93184f, 2.68092f, 7.08871f, 2.53776f)
        curveTo(7.67799f, 2f, 8.66873f, 2f, 10.6502f, 2f)
        horizontalLineTo(13.3498f)
        curveTo(15.3313f, 2f, 16.322f, 2f, 16.9113f, 2.53776f)
        curveTo(17.0682f, 2.68092f, 17.201f, 2.84733f, 17.305f, 3.03089f)
        curveTo(17.6955f, 3.72039f, 17.4553f, 4.66034f, 16.9747f, 6.54026f)
        curveTo(16.5915f, 8.03898f, 16.4f, 8.78834f, 15.8877f, 9.28153f)
        curveTo(15.7483f, 9.41576f, 15.5936f, 9.5339f, 15.4266f, 9.63362f)
        curveTo(14.8131f, 10f, 14.0233f, 10f, 12.4436f, 10f)
        horizontalLineTo(11.5564f)
        curveTo(9.97674f, 10f, 9.18689f, 10f, 8.5734f, 9.63362f)
        curveTo(8.40642f, 9.5339f, 8.2517f, 9.41576f, 8.11228f, 9.28153f)
        curveTo(7.60002f, 8.78834f, 7.40846f, 8.03898f, 7.02532f, 6.54026f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(10f, 18f)
        horizontalLineTo(14f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(11.5f, 10f)
        lineTo(12.5f, 7f)
        }
        }.build()

        return _weightScale!!
    }

private var _weightScale: ImageVector? = null
