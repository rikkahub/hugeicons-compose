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

val HugeIcons.Turtle: ImageVector
    get() {
        if (_turtle != null) {
            return _turtle!!
        }
        _turtle = ImageVector.Builder(
            name = "Turtle",
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
            moveTo(17f, 12f)
            curveTo(17f, 8.13401f, 13.866f, 5f, 10f, 5f)
            curveTo(6.13401f, 5f, 3f, 8.13401f, 3f, 12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Butt,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(17f, 15f)
            curveTo(18.6569f, 15f, 20f, 13.6569f, 20f, 12f)
            curveTo(21.1046f, 12f, 22f, 11.1046f, 22f, 10f)
            curveTo(22f, 8.89543f, 21.1046f, 8f, 20f, 8f)
            horizontalLineTo(19.5f)
            curveTo(18.1193f, 8f, 17f, 9.11929f, 17f, 10.5f)
            verticalLineTo(12f)
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
            moveTo(3f, 14.5f)
            lineTo(2.6405f, 17.376f)
            curveTo(2.5659f, 17.9728f, 3.03128f, 18.5f, 3.63278f, 18.5f)
            horizontalLineTo(5f)
            curveTo(5.55228f, 18.5f, 6f, 18.0523f, 6f, 17.5f)
            verticalLineTo(15f)
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
            moveTo(14f, 15f)
            verticalLineTo(17.5f)
            curveTo(14f, 18.0523f, 14.4477f, 18.5f, 15f, 18.5f)
            horizontalLineTo(16.347f)
            curveTo(16.9555f, 18.5f, 17.423f, 17.961f, 17.3369f, 17.3586f)
            lineTo(17f, 15f)
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
            moveTo(17f, 12f)
            horizontalLineTo(15.4343f)
            curveTo(14.4911f, 12f, 13.5608f, 12.2196f, 12.7171f, 12.6414f)
            curveTo(11.0067f, 13.4967f, 8.99334f, 13.4967f, 7.28286f, 12.6414f)
            curveTo(6.43921f, 12.2196f, 5.50894f, 12f, 4.56572f, 12f)
            horizontalLineTo(2f)
            verticalLineTo(12.882f)
            curveTo(2f, 13.5672f, 2.38713f, 14.1936f, 3f, 14.5f)
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
            moveTo(6f, 16f)
            curveTo(8.51806f, 17.259f, 11.4819f, 17.259f, 14f, 16f)
        }
        }.build()

        return _turtle!!
    }

private var _turtle: ImageVector? = null
