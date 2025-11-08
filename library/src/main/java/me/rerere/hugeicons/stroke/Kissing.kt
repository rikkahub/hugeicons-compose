package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Kissing: ImageVector
    get() {
        if (_kissing != null) {
            return _kissing!!
        }
        _kissing = ImageVector.Builder(
            name = "Kissing",
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
        moveTo(15.5f, 21.3704f)
        curveTo(14.4107f, 21.7775f, 13.2313f, 22f, 12f, 22f)
        curveTo(6.47715f, 22f, 2f, 17.5228f, 2f, 12f)
        curveTo(2f, 6.47715f, 6.47715f, 2f, 12f, 2f)
        curveTo(17.6451f, 2f, 22.2649f, 6.87148f, 21.9877f, 12.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(17f, 9.5f)
        curveTo(17f, 8.67157f, 16.3284f, 8f, 15.5f, 8f)
        curveTo(14.6716f, 8f, 14f, 8.67157f, 14f, 9.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(8.00897f, 9f)
        horizontalLineTo(8f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(10f, 14f)
        curveTo(10.7418f, 14f, 12.2153f, 14.2837f, 12.8323f, 14.7957f)
        curveTo(13.3942f, 15.2619f, 11.9234f, 15.654f, 11.9234f, 16f)
        curveTo(11.9234f, 16.346f, 13.5081f, 16.6436f, 12.8323f, 17.2043f)
        curveTo(12.2153f, 17.7163f, 10.7418f, 18f, 10f, 18f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(19.3509f, 14.9103f)
        curveTo(20.2063f, 14.4336f, 21.2674f, 14.7714f, 21.7545f, 15.6998f)
        curveTo(22.2413f, 16.6283f, 21.981f, 17.8011f, 21.1782f, 18.3788f)
        lineTo(19.6234f, 19.366f)
        curveTo(18.8699f, 19.8445f, 18.4932f, 20.0837f, 18.1206f, 19.9735f)
        curveTo(17.748f, 19.8633f, 17.5301f, 19.4483f, 17.0945f, 18.6182f)
        lineTo(16.1958f, 16.906f)
        curveTo(15.7624f, 15.9627f, 16.0692f, 14.8017f, 16.9109f, 14.2679f)
        curveTo(17.7538f, 13.7338f, 18.8242f, 14.0239f, 19.3509f, 14.9103f)
        }
        }.build()

        return _kissing!!
    }

private var _kissing: ImageVector? = null
