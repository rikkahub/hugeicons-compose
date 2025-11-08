package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.SoilMoistureField: ImageVector
    get() {
        if (_soilMoistureField != null) {
            return _soilMoistureField!!
        }
        _soilMoistureField = ImageVector.Builder(
            name = "SoilMoistureField",
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
        moveTo(2f, 3f)
        curveTo(3.86377f, 3f, 4.79565f, 3f, 5.53073f, 3.30448f)
        curveTo(6.51085f, 3.71046f, 7.28954f, 4.48915f, 7.69552f, 5.46927f)
        curveTo(8f, 6.20435f, 8f, 7.13623f, 8f, 9f)
        curveTo(6.13623f, 9f, 5.20435f, 9f, 4.46927f, 8.69552f)
        curveTo(3.48915f, 8.28954f, 2.71046f, 7.51085f, 2.30448f, 6.53073f)
        curveTo(2f, 5.79565f, 2f, 4.86377f, 2f, 3f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 5f)
        curveTo(10.7575f, 5f, 10.1362f, 5f, 9.64618f, 5.20299f)
        curveTo(8.99277f, 5.47364f, 8.47364f, 5.99277f, 8.20299f, 6.64618f)
        curveTo(8f, 7.13623f, 8f, 7.75749f, 8f, 9f)
        curveTo(9.24251f, 9f, 9.86377f, 9f, 10.3538f, 8.79701f)
        curveTo(11.0072f, 8.52636f, 11.5264f, 8.00723f, 11.797f, 7.35382f)
        curveTo(12f, 6.86377f, 12f, 6.24251f, 12f, 5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(8f, 9f)
        verticalLineTo(14f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 14f)
        lineTo(2f, 14f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 17f)
        lineTo(2f, 17f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 20f)
        lineTo(2f, 20f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(16f, 18.5034f)
        curveTo(16f, 17.2482f, 17.0532f, 16.0077f, 17.7924f, 15.2917f)
        curveTo(18.1939f, 14.9028f, 18.8061f, 14.9028f, 19.2076f, 15.2917f)
        curveTo(19.9468f, 16.0077f, 21f, 17.2482f, 21f, 18.5034f)
        curveTo(21f, 19.7341f, 20.0533f, 21f, 18.5f, 21f)
        curveTo(16.9467f, 21f, 16f, 19.7341f, 16f, 18.5034f)
        }
        }.build()

        return _soilMoistureField!!
    }

private var _soilMoistureField: ImageVector? = null
