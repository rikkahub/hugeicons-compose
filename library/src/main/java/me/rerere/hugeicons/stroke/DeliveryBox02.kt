package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.DeliveryBox02: ImageVector
    get() {
        if (_deliveryBox02 != null) {
            return _deliveryBox02!!
        }
        _deliveryBox02 = ImageVector.Builder(
            name = "DeliveryBox02",
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
        moveTo(2.5f, 13.5f)
        verticalLineTo(6.5f)
        horizontalLineTo(21.5f)
        verticalLineTo(13.5f)
        curveTo(21.5f, 17.2712f, 21.5f, 19.1569f, 20.3284f, 20.3284f)
        curveTo(19.1569f, 21.5f, 17.2712f, 21.5f, 13.5f, 21.5f)
        horizontalLineTo(10.5f)
        curveTo(6.72876f, 21.5f, 4.84315f, 21.5f, 3.67157f, 20.3284f)
        curveTo(2.5f, 19.1569f, 2.5f, 17.2712f, 2.5f, 13.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(2.5f, 6.5f)
        lineTo(3.1f, 5.7f)
        curveTo(4.27771f, 4.12972f, 4.86656f, 3.34458f, 5.71115f, 2.92229f)
        curveTo(6.55573f, 2.5f, 7.53715f, 2.5f, 9.5f, 2.5f)
        horizontalLineTo(14.5f)
        curveTo(16.4628f, 2.5f, 17.4443f, 2.5f, 18.2889f, 2.92229f)
        curveTo(19.1334f, 3.34458f, 19.7223f, 4.12972f, 20.9f, 5.7f)
        lineTo(21.5f, 6.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(6f, 18f)
        horizontalLineTo(11f)
        moveTo(6f, 15f)
        horizontalLineTo(9f)
        }
        }.build()

        return _deliveryBox02!!
    }

private var _deliveryBox02: ImageVector? = null
