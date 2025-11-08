package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.PolyTank: ImageVector
    get() {
        if (_polyTank != null) {
            return _polyTank!!
        }
        _polyTank = ImageVector.Builder(
            name = "PolyTank",
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
        moveTo(9.375f, 4.7686f)
        curveTo(8.57164f, 4.93458f, 7.78616f, 5.17556f, 7.02247f, 5.48619f)
        curveTo(6.12831f, 5.84989f, 5.68124f, 6.03174f, 5.34062f, 6.53801f)
        curveTo(5f, 7.04427f, 5f, 7.6177f, 5f, 8.76457f)
        verticalLineTo(17.024f)
        curveTo(5f, 18.4927f, 5f, 19.2271f, 5.47504f, 19.7869f)
        curveTo(5.95008f, 20.3467f, 6.59936f, 20.4538f, 7.89792f, 20.668f)
        curveTo(9.21368f, 20.885f, 10.5873f, 21f, 12f, 21f)
        curveTo(13.4127f, 21f, 14.7863f, 20.885f, 16.1021f, 20.668f)
        curveTo(17.4006f, 20.4538f, 18.0499f, 20.3467f, 18.525f, 19.7869f)
        curveTo(19f, 19.2271f, 19f, 18.4927f, 19f, 17.024f)
        verticalLineTo(8.76457f)
        curveTo(19f, 7.6177f, 19f, 7.04427f, 18.6594f, 6.53801f)
        curveTo(18.3188f, 6.03174f, 17.8717f, 5.84989f, 16.9775f, 5.48619f)
        curveTo(16.2138f, 5.17556f, 15.4284f, 4.93458f, 14.625f, 4.7686f)
        moveTo(9.375f, 4.7686f)
        curveTo(10.2313f, 4.5917f, 11.1078f, 4.5f, 12f, 4.5f)
        curveTo(12.8922f, 4.5f, 13.7687f, 4.5917f, 14.625f, 4.7686f)
        moveTo(9.375f, 4.7686f)
        verticalLineTo(4f)
        curveTo(9.375f, 3.05719f, 9.375f, 2.58579f, 9.66789f, 2.29289f)
        curveTo(9.96079f, 2f, 10.4322f, 2f, 11.375f, 2f)
        horizontalLineTo(12.625f)
        curveTo(13.5678f, 2f, 14.0392f, 2f, 14.3321f, 2.29289f)
        curveTo(14.625f, 2.58579f, 14.625f, 3.05719f, 14.625f, 4f)
        verticalLineTo(4.7686f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(10f, 20.5f)
        verticalLineTo(19f)
        curveTo(10f, 18.0572f, 10f, 17.5858f, 10.2929f, 17.2929f)
        curveTo(10.5858f, 17f, 11.0572f, 17f, 12f, 17f)
        curveTo(12.9428f, 17f, 13.4142f, 17f, 13.7071f, 17.2929f)
        curveTo(14f, 17.5858f, 14f, 18.0572f, 14f, 19f)
        verticalLineTo(20.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(19f, 12f)
        curveTo(16.8564f, 11.3568f, 14.4889f, 11f, 12f, 11f)
        curveTo(9.51113f, 11f, 7.14362f, 11.3568f, 5f, 12f)
        }
        }.build()

        return _polyTank!!
    }

private var _polyTank: ImageVector? = null
