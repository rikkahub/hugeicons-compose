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

val HugeIcons.Wheelchair: ImageVector
    get() {
        if (_wheelchair != null) {
            return _wheelchair!!
        }
        _wheelchair = ImageVector.Builder(
            name = "Wheelchair",
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
            moveTo(13f, 16.5f)
            curveTo(13f, 19.5376f, 10.5376f, 22f, 7.5f, 22f)
            curveTo(4.46243f, 22f, 2f, 19.5376f, 2f, 16.5f)
            curveTo(2f, 13.4624f, 4.46243f, 11f, 7.5f, 11f)
            curveTo(10.5376f, 11f, 13f, 13.4624f, 13f, 16.5f)
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
            moveTo(22f, 20f)
            curveTo(22f, 21.1046f, 21.1046f, 22f, 20f, 22f)
            curveTo(18.8954f, 22f, 18f, 21.1046f, 18f, 20f)
            curveTo(18f, 18.8954f, 18.8954f, 18f, 20f, 18f)
            curveTo(21.1046f, 18f, 22f, 18.8954f, 22f, 20f)
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
            moveTo(13f, 14f)
            horizontalLineTo(16f)
            curveTo(16.93f, 14f, 17.395f, 14f, 17.7765f, 14.1022f)
            curveTo(18.8117f, 14.3796f, 19.6204f, 15.1883f, 19.8978f, 16.2235f)
            curveTo(20f, 16.605f, 20f, 17.07f, 20f, 18f)
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
            moveTo(5f, 11f)
            verticalLineTo(5f)
            curveTo(5f, 4.06812f, 5f, 3.60218f, 4.84776f, 3.23463f)
            curveTo(4.64477f, 2.74458f, 4.25542f, 2.35523f, 3.76537f, 2.15224f)
            curveTo(3.39782f, 2f, 2.93188f, 2f, 2f, 2f)
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
            moveTo(5f, 7f)
            horizontalLineTo(18f)
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
            moveTo(16f, 7f)
            verticalLineTo(14f)
        }
        }.build()

        return _wheelchair!!
    }

private var _wheelchair: ImageVector? = null
