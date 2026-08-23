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

val HugeIcons.FishOff: ImageVector
    get() {
        if (_fishOff != null) {
            return _fishOff!!
        }
        _fishOff = ImageVector.Builder(
            name = "FishOff",
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
            moveTo(6f, 12f)
            verticalLineTo(11.875f)
            moveTo(6.25f, 12f)
            curveTo(6.25f, 12.1381f, 6.13807f, 12.25f, 6f, 12.25f)
            curveTo(5.86193f, 12.25f, 5.75f, 12.1381f, 5.75f, 12f)
            curveTo(5.75f, 11.8619f, 5.86193f, 11.75f, 6f, 11.75f)
            curveTo(6.13807f, 11.75f, 6.25f, 11.8619f, 6.25f, 12f)
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
            moveTo(10.8623f, 16.0169f)
            curveTo(11.3316f, 16.1722f, 11.7813f, 16.3511f, 12.1887f, 16.6371f)
            curveTo(12.703f, 16.9982f, 13.1229f, 17.5003f, 13.4181f, 18.0741f)
            curveTo(13.7653f, 18.7491f, 13.9389f, 19.0866f, 13.5925f, 19.5882f)
            curveTo(13.2462f, 20.0898f, 12.7871f, 20.0357f, 11.8689f, 19.9276f)
            curveTo(10.2479f, 19.7367f, 9.35755f, 19.304f, 8.94808f, 18.6943f)
            lineTo(7.8248f, 16.8446f)
            curveTo(5.84047f, 16.4427f, 3.98226f, 15.3571f, 2.67918f, 13.5879f)
            curveTo(2.22639f, 12.9731f, 2f, 12.6657f, 2f, 11.9969f)
            curveTo(2f, 11.328f, 2.2264f, 11.0206f, 2.67921f, 10.4058f)
            curveTo(3.85773f, 8.80576f, 5.49031f, 7.76486f, 7.25959f, 7.28313f)
            moveTo(12.1887f, 16.6371f)
            curveTo(13.2213f, 16.322f, 14.2014f, 15.8133f, 15.0642f, 15.1112f)
            moveTo(17.4437f, 11.9969f)
            curveTo(17.7812f, 11.3269f, 19.57f, 8.98187f, 22f, 8.98187f)
            curveTo(21.1562f, 9.81937f, 19.7725f, 13.0019f, 20.9875f, 15.0119f)
            curveTo(19.7725f, 15.0119f, 17.9499f, 12.6669f, 17.4437f, 11.9969f)
            close()
            moveTo(17.4437f, 11.9969f)
            curveTo(16.3965f, 9.68707f, 14.5671f, 8.17356f, 12.4949f, 7.45635f)
            curveTo(12.9557f, 7.13281f, 13.2821f, 6.64475f, 13.5036f, 6.08685f)
            curveTo(13.8494f, 5.21584f, 14.0223f, 4.78034f, 13.6229f, 4.31401f)
            curveTo(13.2235f, 3.84769f, 12.683f, 3.97328f, 11.6019f, 4.22445f)
            curveTo(10.9657f, 4.37226f, 10.3114f, 4.55255f, 9.804f, 4.75741f)
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
            moveTo(2f, 2f)
            lineTo(22f, 22f)
        }
        }.build()

        return _fishOff!!
    }

private var _fishOff: ImageVector? = null
