package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.ContainerTruck: ImageVector
    get() {
        if (_containerTruck != null) {
            return _containerTruck!!
        }
        _containerTruck = ImageVector.Builder(
            name = "ContainerTruck",
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
        moveTo(10f, 9f)
        verticalLineTo(11f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(5f, 17.9724f)
        curveTo(3.90328f, 17.9178f, 3.2191f, 17.7546f, 2.73223f, 17.2678f)
        curveTo(2f, 16.5355f, 2f, 15.357f, 2f, 13f)
        verticalLineTo(9f)
        curveTo(2f, 6.64298f, 2f, 5.46447f, 2.73223f, 4.73223f)
        curveTo(3.46447f, 4f, 4.64298f, 4f, 7f, 4f)
        horizontalLineTo(10.3f)
        curveTo(11.4168f, 4f, 11.9752f, 4f, 12.4271f, 4.14683f)
        curveTo(13.3404f, 4.44358f, 14.0564f, 5.15964f, 14.3532f, 6.07295f)
        curveTo(14.5f, 6.52485f, 14.5f, 7.08323f, 14.5f, 8.2f)
        curveTo(14.5f, 8.94451f, 14.5f, 9.31677f, 14.5979f, 9.61803f)
        curveTo(14.7957f, 10.2269f, 15.2731f, 10.7043f, 15.882f, 10.9021f)
        curveTo(16.1832f, 11f, 16.5555f, 11f, 17.3f, 11f)
        horizontalLineTo(22f)
        verticalLineTo(13f)
        curveTo(22f, 15.357f, 22f, 16.5355f, 21.2678f, 17.2678f)
        curveTo(20.7809f, 17.7546f, 20.0967f, 17.9178f, 19f, 17.9724f)
        moveTo(9f, 18f)
        horizontalLineTo(15f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(14.5f, 6f)
        horizontalLineTo(16.3212f)
        curveTo(17.7766f, 6f, 18.5042f, 6f, 19.0964f, 6.35371f)
        curveTo(19.6886f, 6.70742f, 20.0336f, 7.34811f, 20.7236f, 8.6295f)
        lineTo(22f, 11f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(6f, 9f)
        verticalLineTo(11f)
        }
        }.build()

        return _containerTruck!!
    }

private var _containerTruck: ImageVector? = null
