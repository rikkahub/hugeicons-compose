package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.CableCar: ImageVector
    get() {
        if (_cableCar != null) {
            return _cableCar!!
        }
        _cableCar = ImageVector.Builder(
            name = "CableCar",
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
        moveTo(4.41268f, 11.6239f)
        curveTo(4.14236f, 12.8529f, 4f, 14.1289f, 4f, 15.4375f)
        curveTo(4f, 16.3375f, 4.06733f, 17.2219f, 4.1973f, 18.0863f)
        curveTo(4.44397f, 19.7269f, 4.56731f, 20.5471f, 5.41113f, 21.2736f)
        curveTo(6.25496f, 22f, 7.27731f, 22f, 9.322f, 22f)
        horizontalLineTo(14.678f)
        curveTo(16.7227f, 22f, 17.745f, 22f, 18.5889f, 21.2736f)
        curveTo(19.4327f, 20.5471f, 19.556f, 19.7269f, 19.8027f, 18.0863f)
        curveTo(19.9327f, 17.2219f, 20f, 16.3375f, 20f, 15.4375f)
        curveTo(20f, 14.1289f, 19.8576f, 12.8529f, 19.5873f, 11.6239f)
        curveTo(19.2501f, 10.0905f, 19.0814f, 9.32383f, 18.2581f, 8.66191f)
        curveTo(17.4348f, 8f, 16.4673f, 8f, 14.5325f, 8f)
        horizontalLineTo(9.46753f)
        curveTo(7.53265f, 8f, 6.56522f, 8f, 5.7419f, 8.66191f)
        curveTo(4.91858f, 9.32383f, 4.74994f, 10.0905f, 4.41268f, 11.6239f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(4f, 2f)
        horizontalLineTo(14f)
        moveTo(20f, 2f)
        horizontalLineTo(14f)
        moveTo(14f, 2f)
        lineTo(12f, 5.5f)
        moveTo(9f, 5.5f)
        horizontalLineTo(15f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(4.5f, 16f)
        horizontalLineTo(19.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 9f)
        verticalLineTo(16f)
        }
        }.build()

        return _cableCar!!
    }

private var _cableCar: ImageVector? = null
