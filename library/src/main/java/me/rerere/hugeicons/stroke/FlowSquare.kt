package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.FlowSquare: ImageVector
    get() {
        if (_flowSquare != null) {
            return _flowSquare!!
        }
        _flowSquare = ImageVector.Builder(
            name = "FlowSquare",
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
        moveTo(12.5f, 4.5f)
        curveTo(12.5f, 3.32149f, 12.5f, 2.73223f, 12.8661f, 2.36612f)
        curveTo(13.2322f, 2f, 13.8215f, 2f, 15f, 2f)
        curveTo(16.1785f, 2f, 16.7678f, 2f, 17.1339f, 2.36612f)
        curveTo(17.5f, 2.73223f, 17.5f, 3.32149f, 17.5f, 4.5f)
        curveTo(17.5f, 5.67851f, 17.5f, 6.26777f, 17.1339f, 6.63388f)
        curveTo(16.7678f, 7f, 16.1785f, 7f, 15f, 7f)
        curveTo(13.8215f, 7f, 13.2322f, 7f, 12.8661f, 6.63388f)
        curveTo(12.5f, 6.26777f, 12.5f, 5.67851f, 12.5f, 4.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12.5f, 19.5f)
        curveTo(12.5f, 18.3215f, 12.5f, 17.7322f, 12.8661f, 17.3661f)
        curveTo(13.2322f, 17f, 13.8215f, 17f, 15f, 17f)
        curveTo(16.1785f, 17f, 16.7678f, 17f, 17.1339f, 17.3661f)
        curveTo(17.5f, 17.7322f, 17.5f, 18.3215f, 17.5f, 19.5f)
        curveTo(17.5f, 20.6785f, 17.5f, 21.2678f, 17.1339f, 21.6339f)
        curveTo(16.7678f, 22f, 16.1785f, 22f, 15f, 22f)
        curveTo(13.8215f, 22f, 13.2322f, 22f, 12.8661f, 21.6339f)
        curveTo(12.5f, 21.2678f, 12.5f, 20.6785f, 12.5f, 19.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(2f, 12f)
        curveTo(2f, 10.5858f, 2f, 9.87868f, 2.51256f, 9.43934f)
        curveTo(3.02513f, 9f, 3.85008f, 9f, 5.5f, 9f)
        curveTo(7.14992f, 9f, 7.97487f, 9f, 8.48744f, 9.43934f)
        curveTo(9f, 9.87868f, 9f, 10.5858f, 9f, 12f)
        curveTo(9f, 13.4142f, 9f, 14.1213f, 8.48744f, 14.5607f)
        curveTo(7.97487f, 15f, 7.14992f, 15f, 5.5f, 15f)
        curveTo(3.85008f, 15f, 3.02513f, 15f, 2.51256f, 14.5607f)
        curveTo(2f, 14.1213f, 2f, 13.4142f, 2f, 12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(21.9994f, 4.50009f)
        horizontalLineTo(17.5f)
        moveTo(5.5f, 9.00018f)
        verticalLineTo(8f)
        curveTo(5.5f, 6.59554f, 5.5f, 5.89331f, 5.83706f, 5.38886f)
        curveTo(5.98298f, 5.17048f, 6.17048f, 4.98298f, 6.38886f, 4.83706f)
        curveTo(6.89331f, 4.5f, 7.59554f, 4.5f, 9f, 4.5f)
        horizontalLineTo(12.5f)
        moveTo(21.9994f, 19.5004f)
        horizontalLineTo(17.5f)
        moveTo(5.5f, 15.0003f)
        verticalLineTo(16.0005f)
        curveTo(5.5f, 17.405f, 5.5f, 18.1072f, 5.83706f, 18.6116f)
        curveTo(5.98298f, 18.83f, 6.17048f, 19.0175f, 6.38886f, 19.1634f)
        curveTo(6.89331f, 19.5005f, 7.59554f, 19.5005f, 9f, 19.5005f)
        horizontalLineTo(12.5f)
        }
        }.build()

        return _flowSquare!!
    }

private var _flowSquare: ImageVector? = null
