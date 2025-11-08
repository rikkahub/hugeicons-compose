package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.TwoFinger03: ImageVector
    get() {
        if (_twoFinger03 != null) {
            return _twoFinger03!!
        }
        _twoFinger03 = ImageVector.Builder(
            name = "TwoFinger03",
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
        moveTo(11.5f, 6f)
        curveTo(11.5f, 5.17157f, 10.8284f, 4.5f, 10f, 4.5f)
        curveTo(9.17157f, 4.5f, 8.5f, 5.17157f, 8.5f, 6f)
        verticalLineTo(13.9623f)
        lineTo(6.8797f, 12.3369f)
        curveTo(6.16877f, 11.6237f, 4.99772f, 11.6888f, 4.36965f, 12.4763f)
        curveTo(3.88907f, 13.0789f, 3.8758f, 13.9314f, 4.33738f, 14.5487f)
        lineTo(7.34137f, 18.5667f)
        curveTo(8.02311f, 19.4785f, 8.36398f, 19.9344f, 8.77419f, 20.2888f)
        curveTo(9.40001f, 20.8294f, 10.1499f, 21.2056f, 10.9566f, 21.3834f)
        curveTo(11.4853f, 21.5f, 12.0534f, 21.5f, 13.1896f, 21.5f)
        curveTo(15.3562f, 21.5f, 16.4395f, 21.5f, 17.3019f, 21.1679f)
        curveTo(18.6207f, 20.6601f, 19.6627f, 19.6148f, 20.1689f, 18.2918f)
        curveTo(20.5f, 17.4267f, 20.5f, 16.34f, 20.5f, 14.1667f)
        verticalLineTo(11.5f)
        curveTo(20.5f, 10.3954f, 19.6046f, 9.5f, 18.5f, 9.5f)
        curveTo(17.9477f, 9.5f, 17.5f, 9.94772f, 17.5f, 10.5f)
        moveTo(11.5f, 6f)
        verticalLineTo(4f)
        curveTo(11.5f, 3.17157f, 12.1716f, 2.5f, 13f, 2.5f)
        curveTo(13.8284f, 2.5f, 14.5f, 3.17157f, 14.5f, 4f)
        verticalLineTo(9f)
        moveTo(11.5f, 6f)
        verticalLineTo(10.5f)
        moveTo(14.5f, 9f)
        verticalLineTo(10.5f)
        moveTo(14.5f, 9f)
        lineTo(15.0777f, 8.71115f)
        curveTo(15.3554f, 8.57229f, 15.666f, 8.48266f, 15.9679f, 8.55504f)
        curveTo(16.8468f, 8.76572f, 17.5f, 9.55657f, 17.5f, 10.5f)
        moveTo(17.5f, 10.5f)
        verticalLineTo(11.5f)
        }
        }.build()

        return _twoFinger03!!
    }

private var _twoFinger03: ImageVector? = null
