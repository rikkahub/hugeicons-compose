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

val HugeIcons.AiImagine: ImageVector
    get() {
        if (_aiImagine != null) {
            return _aiImagine!!
        }
        _aiImagine = ImageVector.Builder(
            name = "AiImagine",
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
            moveTo(13.5001f, 22f)
            lineTo(13.7318f, 20.8445f)
            curveTo(13.8936f, 20.0376f, 14.5333f, 19.4121f, 15.3436f, 19.2685f)
            lineTo(16.156f, 19.1244f)
            curveTo(17.214f, 18.9261f, 17.9047f, 17.9391f, 17.6987f, 16.9201f)
            lineTo(17.3258f, 15.0749f)
            lineTo(18.7846f, 13.9936f)
            curveTo(18.9503f, 13.8708f, 19.0298f, 13.6683f, 18.9898f, 13.4705f)
            curveTo(18.9714f, 13.3797f, 18.9288f, 13.295f, 18.866f, 13.2249f)
            lineTo(16.752f, 10.9684f)
            curveTo(16.5071f, 10.707f, 16.3452f, 10.3827f, 16.2275f, 10.0444f)
            curveTo(15.5249f, 8.02369f, 13.1412f, 5.11904f, 8.23162f, 6.25555f)
            curveTo(3.07736f, 7.44871f, 2.78666f, 11.9991f, 3.07736f, 13.4378f)
            curveTo(3.46185f, 15.3407f, 4.31306f, 16.452f, 5.18511f, 17.4085f)
            curveTo(6.24497f, 18.5711f, 6.26308f, 20.2323f, 5.32602f, 21.4957f)
            lineTo(4.95195f, 22f)
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
            moveTo(19.5f, 2.9375f)
            verticalLineTo(4.5f)
            moveTo(19.5f, 4.5f)
            verticalLineTo(6.0625f)
            moveTo(19.5f, 4.5f)
            horizontalLineTo(18.25f)
            moveTo(19.5f, 4.5f)
            horizontalLineTo(20.75f)
            moveTo(22f, 4.5f)
            lineTo(20.9156f, 4.13852f)
            curveTo(20.4179f, 3.97263f, 20.0274f, 3.58211f, 19.8615f, 3.08443f)
            lineTo(19.5f, 2f)
            lineTo(19.1385f, 3.08443f)
            curveTo(18.9726f, 3.58211f, 18.5821f, 3.97263f, 18.0844f, 4.13852f)
            lineTo(17f, 4.5f)
            lineTo(18.0844f, 4.86148f)
            curveTo(18.5821f, 5.02737f, 18.9726f, 5.41789f, 19.1385f, 5.91557f)
            lineTo(19.5f, 7f)
            lineTo(19.8615f, 5.91557f)
            curveTo(20.0274f, 5.41789f, 20.4179f, 5.02737f, 20.9156f, 4.86148f)
            lineTo(22f, 4.5f)
            close()
        }
        }.build()

        return _aiImagine!!
    }

private var _aiImagine: ImageVector? = null
