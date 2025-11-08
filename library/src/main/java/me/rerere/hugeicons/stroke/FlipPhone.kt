package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.FlipPhone: ImageVector
    get() {
        if (_flipPhone != null) {
            return _flipPhone!!
        }
        _flipPhone = ImageVector.Builder(
            name = "FlipPhone",
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
        moveTo(14.5f, 4f)
        horizontalLineTo(5.5f)
        verticalLineTo(15.5f)
        curveTo(5.5f, 19.0899f, 8.41015f, 22f, 12f, 22f)
        curveTo(15.5899f, 22f, 18.5f, 19.0899f, 18.5f, 15.5f)
        verticalLineTo(8f)
        curveTo(18.5f, 6.11438f, 18.5f, 5.17157f, 17.9142f, 4.58579f)
        curveTo(17.3284f, 4f, 16.3856f, 4f, 14.5f, 4f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(11f, 18f)
        horizontalLineTo(13f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(8.5f, 8.42857f)
        curveTo(8.5f, 8.02959f, 8.5f, 7.83009f, 8.55612f, 7.66972f)
        curveTo(8.65663f, 7.38247f, 8.88247f, 7.15663f, 9.16972f, 7.05612f)
        curveTo(9.33009f, 7f, 9.52959f, 7f, 9.92857f, 7f)
        horizontalLineTo(14.0714f)
        curveTo(14.4704f, 7f, 14.6699f, 7f, 14.8303f, 7.05612f)
        curveTo(15.1175f, 7.15663f, 15.3434f, 7.38247f, 15.4439f, 7.66972f)
        curveTo(15.5f, 7.83009f, 15.5f, 8.02959f, 15.5f, 8.42857f)
        verticalLineTo(9f)
        curveTo(15.5f, 9.4645f, 15.5f, 9.69675f, 15.4692f, 9.89109f)
        curveTo(15.2998f, 10.9608f, 14.4608f, 11.7998f, 13.3911f, 11.9692f)
        curveTo(13.1968f, 12f, 12.4645f, 12f, 12f, 12f)
        curveTo(11.5355f, 12f, 10.8032f, 12f, 10.6089f, 11.9692f)
        curveTo(9.53918f, 11.7998f, 8.70021f, 10.9608f, 8.53078f, 9.89109f)
        curveTo(8.5f, 9.69675f, 8.5f, 9.4645f, 8.5f, 9f)
        verticalLineTo(8.42857f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(5.5f, 4f)
        lineTo(5.5f, 2f)
        }
        }.build()

        return _flipPhone!!
    }

private var _flipPhone: ImageVector? = null
