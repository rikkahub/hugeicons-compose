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

val HugeIcons.HousePlug: ImageVector
    get() {
        if (_housePlug != null) {
            return _housePlug!!
        }
        _housePlug = ImageVector.Builder(
            name = "HousePlug",
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
            moveTo(10f, 10.5f)
            verticalLineTo(12.5f)
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
            moveTo(14f, 10.5f)
            verticalLineTo(12.5f)
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
            moveTo(14.5f, 12.5f)
            horizontalLineTo(9.5f)
            curveTo(8.94772f, 12.5f, 8.5f, 12.9477f, 8.5f, 13.5f)
            verticalLineTo(14f)
            curveTo(8.5f, 15.933f, 10.067f, 17.5f, 12f, 17.5f)
            curveTo(13.933f, 17.5f, 15.5f, 15.933f, 15.5f, 14f)
            verticalLineTo(13.5f)
            curveTo(15.5f, 12.9477f, 15.0523f, 12.5f, 14.5f, 12.5f)
            close()
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Miter,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(8f, 21.4993f)
            curveTo(6.13077f, 21.4993f, 5.19615f, 21.4993f, 4.5f, 21.0974f)
            curveTo(4.04394f, 20.8341f, 3.66523f, 20.4554f, 3.40192f, 19.9993f)
            curveTo(3f, 19.3032f, 3f, 18.3686f, 3f, 16.4993f)
            verticalLineTo(11.6339f)
            curveTo(3f, 10.1929f, 3f, 9.47234f, 3.30505f, 8.84861f)
            curveTo(3.61011f, 8.22489f, 4.17886f, 7.78253f, 5.31635f, 6.89781f)
            lineTo(8.31636f, 4.56447f)
            curveTo(10.0859f, 3.18816f, 10.9707f, 2.5f, 12f, 2.5f)
            curveTo(13.0293f, 2.5f, 13.9141f, 3.18816f, 15.6836f, 4.56447f)
            lineTo(18.6836f, 6.8978f)
            curveTo(19.8211f, 7.78253f, 20.3899f, 8.22489f, 20.6949f, 8.84861f)
            curveTo(21f, 9.47234f, 21f, 10.1929f, 21f, 11.6339f)
            verticalLineTo(16.9993f)
            curveTo(21f, 18.3972f, 21f, 19.0961f, 20.7716f, 19.6474f)
            curveTo(20.4672f, 20.3825f, 19.8831f, 20.9665f, 19.1481f, 21.271f)
            curveTo(18.5967f, 21.4993f, 17.8978f, 21.4993f, 16.5f, 21.4993f)
            horizontalLineTo(16f)
            curveTo(15.07f, 21.4993f, 14.605f, 21.4993f, 14.2235f, 21.3971f)
            curveTo(13.1883f, 21.1197f, 12.3796f, 20.3111f, 12.1022f, 19.2758f)
            curveTo(12f, 18.8943f, 12f, 18.4293f, 12f, 17.4993f)
        }
        }.build()

        return _housePlug!!
    }

private var _housePlug: ImageVector? = null
