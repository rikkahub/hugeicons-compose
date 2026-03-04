package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Waste: ImageVector
    get() {
        if (_waste != null) {
            return _waste!!
        }
        _waste = ImageVector.Builder(
            name = "Waste",
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
        moveTo(3f, 5f)
        horizontalLineTo(8.42963f)
        curveTo(9.09834f, 5f, 9.7228f, 4.6658f, 10.0937f, 4.1094f)
        lineTo(10.9063f, 2.8906f)
        curveTo(11.2772f, 2.3342f, 11.9017f, 2f, 12.5704f, 2f)
        horizontalLineTo(17.0585f)
        curveTo(17.9193f, 2f, 18.6836f, 2.55086f, 18.9558f, 3.36754f)
        lineTo(19.5f, 5f)
        moveTo(21f, 5f)
        horizontalLineTo(8f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(19.5f, 5f)
        lineTo(18.8803f, 14.906f)
        curveTo(18.8588f, 15.2333f, 18.8387f, 15.5385f, 18.8185f, 15.8235f)
        moveTo(4.5f, 5f)
        lineTo(5.10461f, 14.8966f)
        curveTo(5.25945f, 17.3107f, 5.33688f, 18.5177f, 5.97868f, 19.3857f)
        curveTo(6.296f, 19.8149f, 6.7048f, 20.1771f, 7.17905f, 20.4493f)
        curveTo(8.1383f, 21f, 9.42312f, 21f, 11.9927f, 21f)
        horizontalLineTo(14.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(20f, 19f)
        curveTo(20f, 17.3431f, 18.6569f, 16f, 17f, 16f)
        curveTo(15.3431f, 16f, 14f, 17.3431f, 14f, 19f)
        curveTo(14f, 20.6569f, 15.3431f, 22f, 17f, 22f)
        curveTo(18.6569f, 22f, 20f, 20.6569f, 20f, 19f)
        }
        }.build()

        return _waste!!
    }

private var _waste: ImageVector? = null
