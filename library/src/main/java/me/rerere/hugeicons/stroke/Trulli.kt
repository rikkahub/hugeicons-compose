package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Trulli: ImageVector
    get() {
        if (_trulli != null) {
            return _trulli!!
        }
        _trulli = ImageVector.Builder(
            name = "Trulli",
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
        moveTo(3.67201f, 10.5471f)
        lineTo(7.47975f, 5.84674f)
        curveTo(9.55727f, 3.28222f, 10.596f, 1.99995f, 12.0001f, 1.99995f)
        curveTo(13.4042f, 1.99995f, 14.443f, 3.28222f, 16.5205f, 5.84674f)
        lineTo(20.3282f, 10.5471f)
        curveTo(20.8408f, 11.1798f, 21.097f, 11.4961f, 20.9664f, 11.748f)
        curveTo(20.8357f, 12f, 20.4154f, 12f, 19.5748f, 12f)
        horizontalLineTo(4.4254f)
        curveTo(3.5848f, 12f, 3.1645f, 12f, 3.03386f, 11.748f)
        curveTo(2.90322f, 11.4961f, 3.15949f, 11.1798f, 3.67201f, 10.5471f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(6.00012f, 8.50764f)
        curveTo(9.32819f, 9.40699f, 10.8212f, 5.23135f, 13.5795f, 7.91038f)
        curveTo(15.0001f, 9.29003f, 16.4165f, 9.20495f, 18.0001f, 8.50764f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(10.0002f, 21.9999f)
        verticalLineTo(17.9999f)
        curveTo(10.0002f, 16.8953f, 10.8957f, 15.9999f, 12.0002f, 15.9999f)
        curveTo(13.1048f, 15.9999f, 14.0002f, 16.8953f, 14.0002f, 17.9999f)
        verticalLineTo(21.9999f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(19.5002f, 11.9999f)
        lineTo(19.5002f, 19.9999f)
        curveTo(19.5002f, 20.9427f, 19.5002f, 21.4141f, 19.2074f, 21.707f)
        curveTo(18.9145f, 21.9999f, 18.4431f, 21.9999f, 17.5002f, 21.9999f)
        lineTo(6.50024f, 21.9999f)
        curveTo(5.55743f, 21.9999f, 5.08603f, 21.9999f, 4.79314f, 21.707f)
        curveTo(4.50024f, 21.4141f, 4.50024f, 20.9427f, 4.50024f, 19.9999f)
        lineTo(4.50024f, 11.9999f)
        }
        }.build()

        return _trulli!!
    }

private var _trulli: ImageVector? = null
