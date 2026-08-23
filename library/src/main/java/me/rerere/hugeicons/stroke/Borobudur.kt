package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Borobudur: ImageVector
    get() {
        if (_borobudur != null) {
            return _borobudur!!
        }
        _borobudur = ImageVector.Builder(
            name = "Borobudur",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(20f, 19f)
            horizontalLineTo(4f)
            curveTo(2.89543f, 19f, 2f, 19.8954f, 2f, 21f)
            curveTo(2f, 21.5523f, 2.44772f, 22f, 3f, 22f)
            horizontalLineTo(21f)
            curveTo(21.5523f, 22f, 22f, 21.5523f, 22f, 21f)
            curveTo(22f, 19.8954f, 21.1046f, 19f, 20f, 19f)
            close()
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(14f, 7f)
            lineTo(13.1961f, 2.98058f)
            curveTo(13.0821f, 2.41042f, 12.5815f, 2f, 12f, 2f)
            curveTo(11.4185f, 2f, 10.9179f, 2.41041f, 10.8039f, 2.98058f)
            lineTo(10f, 7f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(20f, 19f)
            lineTo(18.1362f, 11.5448f)
            curveTo(17.5905f, 9.36211f, 17.3177f, 8.27077f, 16.5039f, 7.63538f)
            curveTo(15.6901f, 7f, 14.5652f, 7f, 12.3153f, 7f)
            horizontalLineTo(11.6847f)
            curveTo(9.4348f, 7f, 8.30988f, 7f, 7.49609f, 7.63538f)
            curveTo(6.68231f, 8.27077f, 6.40947f, 9.36211f, 5.8638f, 11.5448f)
            lineTo(4f, 19f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(12f, 10.5f)
            verticalLineTo(11.5f)
            moveTo(15f, 14f)
            verticalLineTo(15f)
            moveTo(9f, 14f)
            verticalLineTo(15f)
        }
        }.build()

        return _borobudur!!
    }

private var _borobudur: ImageVector? = null
