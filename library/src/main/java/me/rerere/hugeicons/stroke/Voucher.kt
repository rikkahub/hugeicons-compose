package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Voucher: ImageVector
    get() {
        if (_voucher != null) {
            return _voucher!!
        }
        _voucher = ImageVector.Builder(
            name = "Voucher",
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
        moveTo(4.56324f, 5.55783f)
        lineTo(7.4f, 7.99976f)
        moveTo(7.4f, 7.99976f)
        lineTo(11f, 10.9998f)
        moveTo(7.4f, 7.99976f)
        lineTo(4.50512f, 10.3863f)
        moveTo(7.4f, 7.99976f)
        lineTo(11f, 4.99976f)
        moveTo(2f, 4.49976f)
        curveTo(2f, 5.32818f, 2.67157f, 5.99976f, 3.5f, 5.99976f)
        curveTo(4.32843f, 5.99976f, 5f, 5.32818f, 5f, 4.49976f)
        curveTo(5f, 3.67133f, 4.32843f, 2.99976f, 3.5f, 2.99976f)
        curveTo(2.67157f, 2.99976f, 2f, 3.67133f, 2f, 4.49976f)
        moveTo(2f, 11.4998f)
        curveTo(2f, 12.3282f, 2.67157f, 12.9998f, 3.5f, 12.9998f)
        curveTo(4.32843f, 12.9998f, 5f, 12.3282f, 5f, 11.4998f)
        curveTo(5f, 10.6713f, 4.32843f, 9.99976f, 3.5f, 9.99976f)
        curveTo(2.67157f, 9.99976f, 2f, 10.6713f, 2f, 11.4998f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(8f, 15.0768f)
        verticalLineTo(14f)
        moveTo(19.8462f, 7.27029f)
        curveTo(20.3409f, 7.41042f, 20.7309f, 7.62313f, 21.0537f, 7.94599f)
        curveTo(21.3766f, 8.26886f, 21.5893f, 8.65887f, 21.7294f, 9.1536f)
        moveTo(21.7294f, 18.8461f)
        curveTo(21.5893f, 19.3408f, 21.3766f, 19.7308f, 21.0537f, 20.0537f)
        curveTo(20.7309f, 20.3766f, 20.3409f, 20.5893f, 19.8462f, 20.7294f)
        moveTo(10.1538f, 20.7294f)
        curveTo(9.65913f, 20.5893f, 9.26913f, 20.3766f, 8.94627f, 20.0537f)
        curveTo(8.62341f, 19.7308f, 8.41071f, 19.3408f, 8.27058f, 18.8461f)
        moveTo(13.9231f, 21f)
        horizontalLineTo(16.0769f)
        moveTo(22f, 15.0768f)
        verticalLineTo(12.9229f)
        moveTo(16.0769f, 7f)
        horizontalLineTo(13.9231f)
        }
        }.build()

        return _voucher!!
    }

private var _voucher: ImageVector? = null
