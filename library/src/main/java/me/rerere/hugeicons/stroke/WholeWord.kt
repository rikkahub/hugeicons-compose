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

val HugeIcons.WholeWord: ImageVector
    get() {
        if (_wholeWord != null) {
            return _wholeWord!!
        }
        _wholeWord = ImageVector.Builder(
            name = "WholeWord",
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
            moveTo(22f, 13.5f)
            curveTo(22f, 13.9645f, 22f, 14.1968f, 21.9692f, 14.3911f)
            curveTo(21.7998f, 15.4608f, 20.9608f, 16.2998f, 19.8911f, 16.4692f)
            curveTo(19.6968f, 16.5f, 19.4645f, 16.5f, 19f, 16.5f)
            horizontalLineTo(5f)
            curveTo(4.5355f, 16.5f, 4.30325f, 16.5f, 4.10891f, 16.4692f)
            curveTo(3.03918f, 16.2998f, 2.20021f, 15.4608f, 2.03078f, 14.3911f)
            curveTo(2f, 14.1968f, 2f, 13.9645f, 2f, 13.5f)
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
            moveTo(7.49609f, 11.5595f)
            horizontalLineTo(9.49609f)
            moveTo(6.49609f, 13.5595f)
            curveTo(6.73655f, 12.6578f, 7.14557f, 11.1267f, 7.53161f, 9.68216f)
            curveTo(7.92043f, 8.22725f, 8.11483f, 7.49979f, 8.49897f, 7.5f)
            curveTo(8.88311f, 7.50021f, 9.07675f, 8.22791f, 9.46402f, 9.68332f)
            curveTo(9.84814f, 11.1269f, 10.2554f, 12.6568f, 10.4961f, 13.5595f)
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
            moveTo(15.5f, 10.5586f)
            horizontalLineTo(14f)
            moveTo(15.5f, 10.5586f)
            curveTo(16.3284f, 10.5586f, 17f, 9.88702f, 17f, 9.05859f)
            curveTo(17f, 8.23017f, 16.3284f, 7.55859f, 15.5f, 7.55859f)
            horizontalLineTo(15f)
            curveTo(14.5286f, 7.55859f, 14.2929f, 7.55859f, 14.1464f, 7.70504f)
            curveTo(14f, 7.85149f, 14f, 8.08719f, 14f, 8.55859f)
            verticalLineTo(10.5586f)
            moveTo(15.5f, 10.5586f)
            curveTo(16.3284f, 10.5586f, 17f, 11.2302f, 17f, 12.0586f)
            curveTo(17f, 12.887f, 16.3284f, 13.5586f, 15.5f, 13.5586f)
            horizontalLineTo(15f)
            curveTo(14.5286f, 13.5586f, 14.2929f, 13.5586f, 14.1464f, 13.4121f)
            curveTo(14f, 13.2657f, 14f, 13.03f, 14f, 12.5586f)
            verticalLineTo(10.5586f)
        }
        }.build()

        return _wholeWord!!
    }

private var _wholeWord: ImageVector? = null
