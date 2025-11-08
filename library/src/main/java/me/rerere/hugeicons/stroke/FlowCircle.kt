package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.FlowCircle: ImageVector
    get() {
        if (_flowCircle != null) {
            return _flowCircle!!
        }
        _flowCircle = ImageVector.Builder(
            name = "FlowCircle",
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
        moveTo(18f, 4.5f)
        curveTo(18f, 5.88071f, 16.8807f, 7f, 15.5f, 7f)
        curveTo(14.1193f, 7f, 13f, 5.88071f, 13f, 4.5f)
        curveTo(13f, 3.11929f, 14.1193f, 2f, 15.5f, 2f)
        curveTo(16.8807f, 2f, 18f, 3.11929f, 18f, 4.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(18f, 19.5f)
        curveTo(18f, 20.8807f, 16.8807f, 22f, 15.5f, 22f)
        curveTo(14.1193f, 22f, 13f, 20.8807f, 13f, 19.5f)
        curveTo(13f, 18.1193f, 14.1193f, 17f, 15.5f, 17f)
        curveTo(16.8807f, 17f, 18f, 18.1193f, 18f, 19.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(10f, 12f)
        curveTo(10f, 14.2091f, 8.20914f, 16f, 6f, 16f)
        curveTo(3.79086f, 16f, 2f, 14.2091f, 2f, 12f)
        curveTo(2f, 9.79086f, 3.79086f, 8f, 6f, 8f)
        curveTo(8.20914f, 8f, 10f, 9.79086f, 10f, 12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(22f, 4.50006f)
        lineTo(18f, 4.49997f)
        moveTo(6f, 7.99988f)
        curveTo(6f, 6.59542f, 6f, 5.89319f, 6.33706f, 5.38874f)
        curveTo(6.48298f, 5.17036f, 6.67048f, 4.98286f, 6.88886f, 4.83694f)
        curveTo(7.39331f, 4.49988f, 8.09554f, 4.49988f, 9.5f, 4.49988f)
        horizontalLineTo(13f)
        moveTo(22f, 19.5002f)
        lineTo(18f, 19.5001f)
        moveTo(6f, 16.0002f)
        curveTo(6f, 17.4046f, 6f, 18.1069f, 6.33706f, 18.6113f)
        curveTo(6.48298f, 18.8297f, 6.67048f, 19.0172f, 6.88886f, 19.1631f)
        curveTo(7.39331f, 19.5002f, 8.09554f, 19.5002f, 9.5f, 19.5002f)
        horizontalLineTo(13f)
        }
        }.build()

        return _flowCircle!!
    }

private var _flowCircle: ImageVector? = null
