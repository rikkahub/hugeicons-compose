package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.ToyTrain: ImageVector
    get() {
        if (_toyTrain != null) {
            return _toyTrain!!
        }
        _toyTrain = ImageVector.Builder(
            name = "ToyTrain",
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
        moveTo(2f, 4f)
        horizontalLineTo(13f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(6f, 8f)
        horizontalLineTo(8f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15f, 12.5f)
        horizontalLineTo(15.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(3f, 4f)
        verticalLineTo(16f)
        curveTo(3f, 16.465f, 3f, 16.6975f, 3.05111f, 16.8882f)
        curveTo(3.18981f, 17.4059f, 3.59413f, 17.8102f, 4.11177f, 17.9489f)
        curveTo(4.30252f, 18f, 4.53501f, 18f, 5f, 18f)
        moveTo(12f, 18f)
        verticalLineTo(4f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(9f, 18f)
        horizontalLineTo(15f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 10f)
        horizontalLineTo(16.8604f)
        curveTo(18.2244f, 10f, 18.5541f, 10.2703f, 18.8216f, 11.6078f)
        curveTo(18.9188f, 12.0942f, 18.8372f, 12.466f, 19.3412f, 12.5064f)
        curveTo(20.1829f, 12.574f, 20.7739f, 13.1392f, 21.0909f, 13.8787f)
        curveTo(21.5458f, 14.9402f, 22f, 15.8324f, 22f, 17f)
        curveTo(22f, 17.4714f, 22f, 17.7071f, 21.8536f, 17.8536f)
        curveTo(21.7071f, 18f, 21.4714f, 18f, 21f, 18f)
        horizontalLineTo(19f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(16f, 10f)
        verticalLineTo(7f)
        moveTo(16f, 7f)
        horizontalLineTo(15f)
        moveTo(16f, 7f)
        horizontalLineTo(17f)
        }
        }.build()

        return _toyTrain!!
    }

private var _toyTrain: ImageVector? = null
