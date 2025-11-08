package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Binoculars: ImageVector
    get() {
        if (_binoculars != null) {
            return _binoculars!!
        }
        _binoculars = ImageVector.Builder(
            name = "Binoculars",
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
        moveTo(21.8551f, 15.5f)
        lineTo(18.9298f, 5.60666f)
        curveTo(18.6485f, 4.65457f, 17.7646f, 4f, 16.7601f, 4f)
        curveTo(15.475f, 4f, 14.4485f, 5.05662f, 14.502f, 6.32437f)
        lineTo(15f, 16f)
        moveTo(22f, 16.5f)
        curveTo(22f, 18.433f, 20.433f, 20f, 18.5f, 20f)
        curveTo(16.567f, 20f, 15f, 18.433f, 15f, 16.5f)
        curveTo(15f, 14.567f, 16.567f, 13f, 18.5f, 13f)
        curveTo(20.433f, 13f, 22f, 14.567f, 22f, 16.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(10f, 8f)
        horizontalLineTo(14f)
        moveTo(9f, 16f)
        horizontalLineTo(15f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(2.14494f, 15.5f)
        lineTo(5.07067f, 5.60666f)
        curveTo(5.35192f, 4.65457f, 6.23586f, 4f, 7.24034f, 4f)
        curveTo(8.52545f, 4f, 9.55194f, 5.05662f, 9.49844f, 6.32437f)
        lineTo(9.00044f, 16f)
        moveTo(9f, 16.5f)
        curveTo(9f, 18.433f, 7.433f, 20f, 5.5f, 20f)
        curveTo(3.567f, 20f, 2f, 18.433f, 2f, 16.5f)
        curveTo(2f, 14.567f, 3.567f, 13f, 5.5f, 13f)
        curveTo(7.433f, 13f, 9f, 14.567f, 9f, 16.5f)
        }
        }.build()

        return _binoculars!!
    }

private var _binoculars: ImageVector? = null
